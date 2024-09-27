# Lost Teddy

Lost and found teddy bear

## Use cases

- As a "person" (?), I want to report a lost teddy bear, by specifying a short description, a photo and the geolocation coordinates.
- As a parent, I want to search for a teddy bear, by specifying a geo area
- As a parent, I want to subscribe to my search for a teddy bear, and get notified (how?) when new pertinent results come in

## Technical informations

This is an attempt to do a clean architecture project with Kotlin.

Running the backend in development: `./gradlew bootRun`

### TODO

- [ ] Authentication
  - [ ] [Keycloak](https://www.keycloak.org/getting-started/getting-started-podman)
- [ ] Documentation
  - [ ] [KMolecules](https://github.com/xmolecules/jmolecules)
- [ ] [Arrow](https://arrow-kt.io/)
- [ ] Proper [clean architecture & CQRS](https://alexbryksin.medium.com/kotlin-clean-architecture-and-cqrs-74f8f0cacca8)

### Technologies used

- [Spring Modulith](https://spring.io/projects/spring-modulith)
