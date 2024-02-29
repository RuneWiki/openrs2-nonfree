package com.jagex;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ajq")
public class Class77_Sub1 extends Class77 {

	@OriginalMember(owner = "client!ajq", name = "w", descriptor = "Lclient!ajq;")
	public Class77_Sub1 aClass77_Sub1_61;

	@OriginalMember(owner = "client!ajq", name = "l", descriptor = "J")
	public long aLong230;

	@OriginalMember(owner = "client!ajq", name = "y", descriptor = "Lclient!ajq;")
	public Class77_Sub1 aClass77_Sub1_62;

	@OriginalMember(owner = "client!ajq", name = "h", descriptor = "(I)V", line = 9)
	public void method24069() {
		if (this.aClass77_Sub1_61 != null) {
			this.aClass77_Sub1_61.aClass77_Sub1_62 = this.aClass77_Sub1_62;
			this.aClass77_Sub1_62.aClass77_Sub1_61 = this.aClass77_Sub1_61;
			this.aClass77_Sub1_62 = null;
			this.aClass77_Sub1_61 = null;
		}
	}

	@OriginalMember(owner = "client!ajq", name = "aj", descriptor = "()V", line = 9)
	public void method24070() {
		if (this.aClass77_Sub1_61 != null) {
			this.aClass77_Sub1_61.aClass77_Sub1_62 = this.aClass77_Sub1_62;
			this.aClass77_Sub1_62.aClass77_Sub1_61 = this.aClass77_Sub1_61;
			this.aClass77_Sub1_62 = null;
			this.aClass77_Sub1_61 = null;
		}
	}
}
