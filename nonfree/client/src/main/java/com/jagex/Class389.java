package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lw")
public class Class389 {

	@OriginalMember(owner = "client!lw", name = "p", descriptor = "Z")
	boolean aBoolean729;

	@OriginalMember(owner = "client!lw", name = "v", descriptor = "Lclient!kp;")
	Interface36 anInterface36_22;

	@OriginalMember(owner = "client!lw", name = "l", descriptor = "Lclient!kp;")
	Interface36 anInterface36_23;

	@OriginalMember(owner = "client!lw", name = "c", descriptor = "Z")
	boolean aBoolean730;

	@OriginalMember(owner = "client!lw", name = "<init>", descriptor = "(Z)V", line = 3493)
	Class389(@OriginalArg(0) boolean arg0) {
		this.aBoolean730 = arg0;
	}

	@OriginalMember(owner = "client!lw", name = "l", descriptor = "()Z", line = 3498)
	boolean method28352() {
		return this.aBoolean729 && !this.aBoolean730;
	}

	@OriginalMember(owner = "client!lw", name = "p", descriptor = "()Z", line = 3498)
	boolean method28353() {
		return this.aBoolean729 && !this.aBoolean730;
	}

	@OriginalMember(owner = "client!lw", name = "v", descriptor = "()Z", line = 3498)
	boolean method28354() {
		return this.aBoolean729 && !this.aBoolean730;
	}

	@OriginalMember(owner = "client!lw", name = "c", descriptor = "()V", line = 3502)
	void method28355() {
		if (this.anInterface36_23 != null) {
			this.anInterface36_23.method30322();
		}
		this.aBoolean729 = false;
	}

	@OriginalMember(owner = "client!lw", name = "y", descriptor = "()V", line = 3502)
	void method28356() {
		if (this.anInterface36_23 != null) {
			this.anInterface36_23.method30322();
		}
		this.aBoolean729 = false;
	}
}
