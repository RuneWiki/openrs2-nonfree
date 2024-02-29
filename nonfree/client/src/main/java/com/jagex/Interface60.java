package com.jagex;

import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public interface Interface60 {

	@OriginalMember(owner = "client!ru", name = "p", descriptor = "(I)Ljava/net/URL;")
	URL method30575();

	@OriginalMember(owner = "client!ru", name = "c", descriptor = "()Ljava/net/URL;")
	URL method30576();

	@OriginalMember(owner = "client!ru", name = "v", descriptor = "()Ljava/net/URL;")
	URL method30577();

	@OriginalMember(owner = "client!ru", name = "l", descriptor = "()Ljava/net/URL;")
	URL method30578();
}
