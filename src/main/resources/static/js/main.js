// Beispiel für einen Controller zum Abrufen und Löschen eines Eintrags
@GetMapping("/{id}")
public ResponseEntity<Tagebuch> getTagebuchById(@PathVariable Long id) {
    return tagebuchRepository.findById(id)
        .map(ResponseEntity::ok)
        .orElse(ResponseEntity.notFound().build());
}

@DeleteMapping("/{id}")
public ResponseEntity<Void> deleteTagebuch(@PathVariable Long id) {
    if (!tagebuchRepository.existsById(id)) {
        return ResponseEntity.notFound().build();
    }
    tagebuchRepository.deleteById(id);
    return ResponseEntity.ok().build();
}
