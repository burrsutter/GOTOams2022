# Using official python runtime base image
FROM python

# Install our requirements.txt
COPY ./requirements.txt /app/requirements.txt

WORKDIR /app

RUN pip install -r requirements.txt

# Copy our code from the current folder to /app inside the container
COPY . /app

EXPOSE 8080

ENTRYPOINT [ "python" ]

CMD ["app.py" ]