package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!asl")
public class Class93_Sub40_Sub1 extends Class93_Sub40 {

	@OriginalMember(owner = "client!asl", name = "w", descriptor = "Lclient!yv;")
	final Class694 aClass694_1;

	@OriginalMember(owner = "client!asl", name = "<init>", descriptor = "(IILclient!yv;)V", line = 12)
	public Class93_Sub40_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class694 arg2) {
		super(arg0, arg1);
		this.aClass694_1 = arg2;
	}

	@OriginalMember(owner = "client!asl", name = "e", descriptor = "(B)Z", line = 17)
	@Override
	public boolean method23193() {
		@Pc(4) Interface61 local4 = this.aClass694_1.method36620();
		if (local4 == null) {
			return false;
		} else {
			Class62.method1155(Class155.aClass155_63, this.anInt3172 * 1220811495, -1, local4);
			return true;
		}
	}

	@OriginalMember(owner = "client!asl", name = "m", descriptor = "()Z", line = 17)
	@Override
	public boolean method23194() {
		@Pc(4) Interface61 local4 = this.aClass694_1.method36620();
		if (local4 == null) {
			return false;
		} else {
			Class62.method1155(Class155.aClass155_63, this.anInt3172 * 1220811495, -1, local4);
			return true;
		}
	}

	@OriginalMember(owner = "client!asl", name = "n", descriptor = "()Z", line = 17)
	@Override
	public boolean method23192() {
		@Pc(4) Interface61 local4 = this.aClass694_1.method36620();
		if (local4 == null) {
			return false;
		} else {
			Class62.method1155(Class155.aClass155_63, this.anInt3172 * 1220811495, -1, local4);
			return true;
		}
	}

	@OriginalMember(owner = "client!asl", name = "k", descriptor = "()Z", line = 17)
	@Override
	public boolean method23195() {
		@Pc(4) Interface61 local4 = this.aClass694_1.method36620();
		if (local4 == null) {
			return false;
		} else {
			Class62.method1155(Class155.aClass155_63, this.anInt3172 * 1220811495, -1, local4);
			return true;
		}
	}
}
