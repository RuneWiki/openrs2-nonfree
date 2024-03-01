package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class Class233 {

	@OriginalMember(owner = "client!ia", name = "p", descriptor = "Z")
	boolean aBoolean679;

	@OriginalMember(owner = "client!ia", name = "l", descriptor = "Lclient!jw;")
	Interface30 anInterface30_5;

	@OriginalMember(owner = "client!ia", name = "g", descriptor = "Lclient!jw;")
	Interface30 anInterface30_6;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "Z")
	boolean aBoolean680;

	@OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Z)V", line = 3486)
	Class233(@OriginalArg(0) boolean arg0) {
		this.aBoolean680 = arg0;
	}

	@OriginalMember(owner = "client!ia", name = "p", descriptor = "()Z", line = 3491)
	boolean method24585() {
		return this.aBoolean679 && !this.aBoolean680;
	}

	@OriginalMember(owner = "client!ia", name = "g", descriptor = "()Z", line = 3491)
	boolean method24586() {
		return this.aBoolean679 && !this.aBoolean680;
	}

	@OriginalMember(owner = "client!ia", name = "l", descriptor = "()Z", line = 3491)
	boolean method24588() {
		return this.aBoolean679 && !this.aBoolean680;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "()V", line = 3495)
	void method24587() {
		if (this.anInterface30_5 != null) {
			this.anInterface30_5.method27209();
		}
		this.aBoolean679 = false;
	}

	@OriginalMember(owner = "client!ia", name = "h", descriptor = "()V", line = 3495)
	void method24589() {
		if (this.anInterface30_5 != null) {
			this.anInterface30_5.method27209();
		}
		this.aBoolean679 = false;
	}

	@OriginalMember(owner = "client!ia", name = "x", descriptor = "()V", line = 3495)
	void method24590() {
		if (this.anInterface30_5 != null) {
			this.anInterface30_5.method27209();
		}
		this.aBoolean679 = false;
	}
}
