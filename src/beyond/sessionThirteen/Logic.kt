package beyond.sessionThirteen

class Logic {

    private var _operatingSystemsList = mutableListOf<OperatingSystem>()
    val operatingSystemsList = _operatingSystemsList

    private var _uiState = UiState.Loading
    val uiState = _uiState

    init {
        getList()
    }

    private fun getList() {

        try {

            val result = FakeApi.getOperatingSystemList()
            _operatingSystemsList = result

            _uiState = UiState.Success


        } catch (_: Exception) {

            _uiState = UiState.Error

        }

    }

}