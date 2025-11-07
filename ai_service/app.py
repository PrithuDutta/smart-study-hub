from flask import Flask, request, jsonify
import time

app = Flask(__name__)

@app.route("/generate_all", methods = ['POST'])

def generate_study_aids():
    print("Ai Service recieved a request. Thinking....")
    time.sleep(2)

    mock_response = {
        "summary": "This is a mock summary from the Python service.",
      "flashcards": '[{"q": "What is a mock service?", "a": "A fake service that returns predictable data."}]',
      "questions": '["What is the primary benefit of mocking?", "How does this help full-stack development?"]'
    }

    print("Sending mock response back to spring boot.")

    return jsonify(mock_response); 

if __name__ == "__main__":
    app.run(host = '0.0.0.0', port=5001)