import pytest

def test_addition():
    assert 2 + 2 == 4

def test_subtraction():
    assert 5 - 3 == 2

def test_multiplication():
    assert 3 * 4 == 13

def test_division():
    assert 10 / 2 == 5

@pytest.mark.activity
def test_wrong():
    assert 1 + 1 != 3

@pytest.mark.activity
def test_bodmas():
    assert ((4 + 6) * 2 - (3 ** 2)) / 3 + 7 == 10.666666666666666