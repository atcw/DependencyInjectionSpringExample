# DependencyInjectionSpringExample

Für SWP16i

Es gibt einen Meister. Dieser hat einen Lehrling.
Der Meister möchte seinem Lehrling befehlen, ein Loch zu buddeln.
Der Lehrling benötig jedoch eine Schaufel um graben zu können.
Diese soll er "magisch" erhalten.

Der Lehrling erhält die Schaufel über Dependency Injection.
Der Meister erhält seinen Lehrling ebenfalls über Dependency Injection.

Die Dependency Injection wurde hier mittels des Spring-Frameworks automatisiert.
Besonders: Die Injection nutzt @Autowired, so dass für die Interfaces die jeweils
benötigt werden automatisch durch vorher gefundene konkrete Implementation
erfüllt werden.

