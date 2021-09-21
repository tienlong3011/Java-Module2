package Java_B4_OOB;

public class StopWatch {

        private long startTime;
        private long endTime;
        private boolean running = false;

        public StopWatch() {

        }

        public boolean isRunning() {
            return this.running;
        }

        public void setStarTime() {
            this.startTime = System.currentTimeMillis();
            this.running = true;
        }

        public void setEndTime() {
            this.endTime = System.currentTimeMillis();
            this.running = false;
        }
        public long getElapsedTime() {
            long elapsed;
            if (running) {
                elapsed = (System.currentTimeMillis() - startTime)/1000;
            } else {
                elapsed = (endTime - startTime)/1000;
            }
            return elapsed;
        }
    }

