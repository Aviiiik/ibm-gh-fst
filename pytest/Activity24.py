import pytest

@pytest.fixture
def wallet():
    amount = 0
    return amount

@pytest.mark.parametrize(
    "earned, spent, expected",
    [
        (100, 40, 60),
        (50, 20, 30),
        (200, 75, 125),
        (10, 5, 5),
        (0, 0, 0)
    ]
)
def test_wallet_transactions(wallet, earned, spent, expected):
    amount = wallet

    amount += earned
    amount -= spent

    assert amount == expected