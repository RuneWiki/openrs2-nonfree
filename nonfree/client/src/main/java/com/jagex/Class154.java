package com.jagex;

import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public class Class154 {

	@OriginalMember(owner = "client!ar", name = "v", descriptor = "[B")
	volatile byte[] aByteArray50;

	@OriginalMember(owner = "client!ar", name = "c", descriptor = "Z")
	volatile boolean aBoolean494;

	@OriginalMember(owner = "client!ar", name = "p", descriptor = "Ljava/net/URL;")
	final URL anURL1;

	@OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(Ljava/net/URL;)V", line = 82)
	Class154(@OriginalArg(0) URL arg0) {
		this.anURL1 = arg0;
	}

	@OriginalMember(owner = "client!ar", name = "w", descriptor = "()Z", line = 87)
	boolean method21837() {
		return this.aBoolean494;
	}

	@OriginalMember(owner = "client!ar", name = "v", descriptor = "()Z", line = 87)
	boolean method21838() {
		return this.aBoolean494;
	}

	@OriginalMember(owner = "client!ar", name = "p", descriptor = "(I)Z", line = 87)
	boolean method21839() {
		return this.aBoolean494;
	}

	@OriginalMember(owner = "client!ar", name = "y", descriptor = "()Z", line = 87)
	boolean method21840() {
		return this.aBoolean494;
	}

	@OriginalMember(owner = "client!ar", name = "x", descriptor = "()Z", line = 87)
	boolean method21841() {
		return this.aBoolean494;
	}

	@OriginalMember(owner = "client!ar", name = "t", descriptor = "()Z", line = 87)
	boolean method21842() {
		return this.aBoolean494;
	}

	@OriginalMember(owner = "client!ar", name = "q", descriptor = "()Z", line = 87)
	boolean method21843() {
		return this.aBoolean494;
	}

	@OriginalMember(owner = "client!ar", name = "l", descriptor = "()Z", line = 87)
	boolean method21844() {
		return this.aBoolean494;
	}

	@OriginalMember(owner = "client!ar", name = "d", descriptor = "()Z", line = 87)
	boolean method21845() {
		return this.aBoolean494;
	}

	@OriginalMember(owner = "client!ar", name = "s", descriptor = "()[B", line = 91)
	byte[] method21846() {
		return this.aByteArray50;
	}

	@OriginalMember(owner = "client!ar", name = "c", descriptor = "(I)[B", line = 91)
	byte[] method21847() {
		return this.aByteArray50;
	}

	@OriginalMember(owner = "client!ar", name = "r", descriptor = "()[B", line = 91)
	byte[] method21848() {
		return this.aByteArray50;
	}
}
