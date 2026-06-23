import pytest

@pytest.fixture
def number_list():
    print("conftest loaded")
    return list(range(11))  
    