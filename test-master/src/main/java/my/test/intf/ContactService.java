package my.test.intf;

import my.test.entity.ContactEntity;
import my.test.repository.ContactRepository;

import java.util.List;

public interface ContactService {
    List<ContactEntity> findAll();

    ContactEntity save(ContactEntity contact);
}
