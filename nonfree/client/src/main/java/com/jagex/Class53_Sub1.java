package com.jagex;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!afa")
public class Class53_Sub1 extends Class53 {

	@OriginalMember(owner = "client!afa", name = "l", descriptor = "Lclient!afa;")
	public Class53_Sub1 aClass53_Sub1_5;

	@OriginalMember(owner = "client!afa", name = "g", descriptor = "Lclient!afa;")
	public Class53_Sub1 aClass53_Sub1_6;

	@OriginalMember(owner = "client!afa", name = "a", descriptor = "(B)V", line = 8)
	public void method20621() {
		if (this.aClass53_Sub1_5 != null) {
			this.aClass53_Sub1_5.aClass53_Sub1_6 = this.aClass53_Sub1_6;
			this.aClass53_Sub1_6.aClass53_Sub1_5 = this.aClass53_Sub1_5;
			this.aClass53_Sub1_6 = null;
			this.aClass53_Sub1_5 = null;
		}
	}
}
