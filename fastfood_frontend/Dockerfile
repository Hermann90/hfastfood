FROM node:16 as builder

RUN mkdir -p /app

WORKDIR /app

COPY . .

RUN npm install
RUN npm run build --prod

CMD node_modules/.bin/ng serve --host 0.0.0.0 --port 4200 --disable-host-check

FROM nginx:alpine
COPY src/nginx/etc/conf.d/default.conf /etc/nginx/conf/default.conf
COPY --from=builder app/dist/ELEFoods usr/share/nginx/html