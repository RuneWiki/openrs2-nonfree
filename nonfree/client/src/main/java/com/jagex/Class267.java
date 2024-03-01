package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jy")
public class Class267 {

	@OriginalMember(owner = "client!jy", name = "p", descriptor = "Z")
	boolean aBoolean692;

	@OriginalMember(owner = "client!jy", name = "g", descriptor = "Lclient!if;")
	Interface21 anInterface21_22;

	@OriginalMember(owner = "client!jy", name = "l", descriptor = "Lclient!if;")
	Interface21 anInterface21_23;

	@OriginalMember(owner = "client!jy", name = "a", descriptor = "Z")
	boolean aBoolean691;

	@OriginalMember(owner = "client!jy", name = "<init>", descriptor = "(Z)V", line = 3466)
	Class267(@OriginalArg(0) boolean arg0) {
		this.aBoolean691 = arg0;
	}

	@OriginalMember(owner = "client!jy", name = "p", descriptor = "()Z", line = 3471)
	boolean method25264() {
		return this.aBoolean692 && !this.aBoolean691;
	}

	@OriginalMember(owner = "client!jy", name = "l", descriptor = "()Z", line = 3471)
	boolean method25267() {
		return this.aBoolean692 && !this.aBoolean691;
	}

	@OriginalMember(owner = "client!jy", name = "g", descriptor = "()Z", line = 3471)
	boolean method25268() {
		return this.aBoolean692 && !this.aBoolean691;
	}

	@OriginalMember(owner = "client!jy", name = "h", descriptor = "()Z", line = 3471)
	boolean method25269() {
		return this.aBoolean692 && !this.aBoolean691;
	}

	@OriginalMember(owner = "client!jy", name = "x", descriptor = "()V", line = 3475)
	void method25263() {
		if (this.anInterface21_23 != null) {
			this.anInterface21_23.method27209();
		}
		this.aBoolean692 = false;
	}

	@OriginalMember(owner = "client!jy", name = "a", descriptor = "()V", line = 3475)
	void method25265() {
		if (this.anInterface21_23 != null) {
			this.anInterface21_23.method27209();
		}
		this.aBoolean692 = false;
	}

	@OriginalMember(owner = "client!jy", name = "s", descriptor = "()V", line = 3475)
	void method25266() {
		if (this.anInterface21_23 != null) {
			this.anInterface21_23.method27209();
		}
		this.aBoolean692 = false;
	}
}
