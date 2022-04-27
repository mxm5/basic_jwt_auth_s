package com.example.sayehwebservices.Utils;

import com.example.sayehwebservices.Config.Security;
import lombok.Data;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
public class AllowedIps {
    public static Set<String> ips = new HashSet<>(
            List.of(
                    "0:0:0:0:0:0:0:1",
                    "127.0.0.1",
                    "localhost"
            )

    );
}
