package chapter5;

    public class AutoPolicy {
        private int accountNumber;
        private String makeAndModel;
        private String state;


        public AutoPolicy(int accountNumber, String makeAndModel, String state) {
            this.accountNumber = accountNumber;
            this.makeAndModel = makeAndModel;
            setState(state);
        }


        public void setState(String state) {

            if (state.equals("CT") || state.equals("MA") || state.equals("ME") ||
                    state.equals("NH") || state.equals("NJ") || state.equals("NY") ||
                    state.equals("PA") || state.equals("VT")) {
                this.state = state;
            } else {
                System.out.println("Error: Invalid state code. Please enter a valid northeast state code.");
            }
        }


        public String getState() {
            return state;
        }


        public int getAccountNumber() {
            return accountNumber;
        }

        public void setAccountNumber(int accountNumber) {
            this.accountNumber = accountNumber;
        }

        public String getMakeAndModel() {
            return makeAndModel;
        }

        public void setMakeAndModel(String makeAndModel) {
            this.makeAndModel = makeAndModel;
        }
    }


