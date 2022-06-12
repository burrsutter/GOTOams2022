import os

from flask import Flask
app = Flask(__name__)


count = 0

@app.route("/")
def main():
    global count
    count += 1
    return os.getenv('GREETING', 'Jambo') + " from Python Flask on " + os.getenv('HOSTNAME', "unknown") + ":" + str(count)


if __name__ == "__main__":
    app.run(host='0.0.0.0',port='8080')

