package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ank")
public class Class3_Sub42_Sub3 extends Class3_Sub42 {

	@OriginalMember(owner = "client!ank", name = "x", descriptor = "Lclient!vt;")
	final Class537 aClass537_1;

	@OriginalMember(owner = "client!ank", name = "<init>", descriptor = "(IILclient!vt;)V", line = 12)
	public Class3_Sub42_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class537 arg2) {
		super(arg0, arg1);
		this.aClass537_1 = arg2;
	}

	@OriginalMember(owner = "client!ank", name = "g", descriptor = "()Z", line = 17)
	@Override
	public boolean method20198() {
		@Pc(4) Interface43 local4 = this.aClass537_1.method32544();
		if (local4 == null) {
			return false;
		} else {
			Class21.method17421(Class634.aClass634_18, this.anInt2796 * 1705574607, -1, local4);
			return true;
		}
	}

	@OriginalMember(owner = "client!ank", name = "p", descriptor = "(B)Z", line = 17)
	@Override
	public boolean method20199() {
		@Pc(4) Interface43 local4 = this.aClass537_1.method32544();
		if (local4 == null) {
			return false;
		} else {
			Class21.method17421(Class634.aClass634_18, this.anInt2796 * 1705574607, -1, local4);
			return true;
		}
	}

	@OriginalMember(owner = "client!ank", name = "a", descriptor = "()Z", line = 17)
	@Override
	public boolean method20197() {
		@Pc(4) Interface43 local4 = this.aClass537_1.method32544();
		if (local4 == null) {
			return false;
		} else {
			Class21.method17421(Class634.aClass634_18, this.anInt2796 * 1705574607, -1, local4);
			return true;
		}
	}

	@OriginalMember(owner = "client!ank", name = "l", descriptor = "()Z", line = 17)
	@Override
	public boolean method20196() {
		@Pc(4) Interface43 local4 = this.aClass537_1.method32544();
		if (local4 == null) {
			return false;
		} else {
			Class21.method17421(Class634.aClass634_18, this.anInt2796 * 1705574607, -1, local4);
			return true;
		}
	}
}
