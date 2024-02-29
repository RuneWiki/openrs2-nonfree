package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class Class356 {

	@OriginalMember(owner = "client!ka", name = "v", descriptor = "Lclient!lc;")
	Interface38 anInterface38_5;

	@OriginalMember(owner = "client!ka", name = "p", descriptor = "Z")
	boolean aBoolean721;

	@OriginalMember(owner = "client!ka", name = "l", descriptor = "Lclient!lc;")
	Interface38 anInterface38_6;

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "Z")
	boolean aBoolean720;

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(Z)V", line = 3513)
	Class356(@OriginalArg(0) boolean arg0) {
		this.aBoolean720 = arg0;
	}

	@OriginalMember(owner = "client!ka", name = "w", descriptor = "()Z", line = 3518)
	boolean method27964() {
		return this.aBoolean721 && !this.aBoolean720;
	}

	@OriginalMember(owner = "client!ka", name = "p", descriptor = "()Z", line = 3518)
	boolean method27965() {
		return this.aBoolean721 && !this.aBoolean720;
	}

	@OriginalMember(owner = "client!ka", name = "v", descriptor = "()Z", line = 3518)
	boolean method27966() {
		return this.aBoolean721 && !this.aBoolean720;
	}

	@OriginalMember(owner = "client!ka", name = "y", descriptor = "()Z", line = 3518)
	boolean method27967() {
		return this.aBoolean721 && !this.aBoolean720;
	}

	@OriginalMember(owner = "client!ka", name = "l", descriptor = "()Z", line = 3518)
	boolean method27968() {
		return this.aBoolean721 && !this.aBoolean720;
	}

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "()V", line = 3522)
	void method27969() {
		if (this.anInterface38_6 != null) {
			this.anInterface38_6.method30322();
		}
		this.aBoolean721 = false;
	}

	@OriginalMember(owner = "client!ka", name = "t", descriptor = "()V", line = 3522)
	void method27970() {
		if (this.anInterface38_6 != null) {
			this.anInterface38_6.method30322();
		}
		this.aBoolean721 = false;
	}
}
