package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gt")
public class Class284 implements Interface75 {

	@OriginalMember(owner = "client!gt", name = "ce", descriptor = "Lclient!dx;")
	public static Class86 aClass86_9;

	@OriginalMember(owner = "client!gt", name = "p", descriptor = "Lclient!gt;")
	static final Class284 aClass284_14 = new Class284(13, 1);

	@OriginalMember(owner = "client!gt", name = "c", descriptor = "Lclient!gt;")
	static final Class284 aClass284_1 = new Class284(9, 2);

	@OriginalMember(owner = "client!gt", name = "v", descriptor = "Lclient!gt;")
	static final Class284 aClass284_2 = new Class284(4, 3);

	@OriginalMember(owner = "client!gt", name = "l", descriptor = "Lclient!gt;")
	static final Class284 aClass284_7 = new Class284(0, 4);

	@OriginalMember(owner = "client!gt", name = "y", descriptor = "Lclient!gt;")
	static final Class284 aClass284_6 = new Class284(5, 5);

	@OriginalMember(owner = "client!gt", name = "w", descriptor = "Lclient!gt;")
	static final Class284 aClass284_4 = new Class284(2, 6);

	@OriginalMember(owner = "client!gt", name = "t", descriptor = "Lclient!gt;")
	static final Class284 aClass284_5 = new Class284(6, 7);

	@OriginalMember(owner = "client!gt", name = "q", descriptor = "Lclient!gt;")
	static final Class284 aClass284_13 = new Class284(7, 8);

	@OriginalMember(owner = "client!gt", name = "x", descriptor = "Lclient!gt;")
	static final Class284 aClass284_3 = new Class284(11, 9);

	@OriginalMember(owner = "client!gt", name = "d", descriptor = "Lclient!gt;")
	static final Class284 aClass284_8 = new Class284(10, 10);

	@OriginalMember(owner = "client!gt", name = "s", descriptor = "Lclient!gt;")
	static final Class284 aClass284_9 = new Class284(1, 11);

	@OriginalMember(owner = "client!gt", name = "r", descriptor = "Lclient!gt;")
	static final Class284 aClass284_10 = new Class284(3, 12);

	@OriginalMember(owner = "client!gt", name = "g", descriptor = "Lclient!gt;")
	static final Class284 aClass284_11 = new Class284(12, 13);

	@OriginalMember(owner = "client!gt", name = "z", descriptor = "Lclient!gt;")
	static final Class284 aClass284_12 = new Class284(8, 14);

	@OriginalMember(owner = "client!gt", name = "j", descriptor = "I")
	final int anInt3966;

	@OriginalMember(owner = "client!gt", name = "i", descriptor = "I")
	final int anInt3967;

	@OriginalMember(owner = "client!gt", name = "p", descriptor = "(B)[Lclient!gt;", line = 115)
	static Class284[] method26710() {
		return new Class284[] { aClass284_7, aClass284_9, aClass284_4, aClass284_10, aClass284_2, aClass284_6, aClass284_5, aClass284_13, aClass284_12, aClass284_1, aClass284_8, aClass284_3, aClass284_11, aClass284_14 };
	}

	@OriginalMember(owner = "client!gt", name = "w", descriptor = "()[Lclient!gt;", line = 115)
	static Class284[] method26711() {
		return new Class284[] { aClass284_7, aClass284_9, aClass284_4, aClass284_10, aClass284_2, aClass284_6, aClass284_5, aClass284_13, aClass284_12, aClass284_1, aClass284_8, aClass284_3, aClass284_11, aClass284_14 };
	}

	@OriginalMember(owner = "client!gt", name = "v", descriptor = "()[Lclient!gt;", line = 115)
	static Class284[] method26712() {
		return new Class284[] { aClass284_7, aClass284_9, aClass284_4, aClass284_10, aClass284_2, aClass284_6, aClass284_5, aClass284_13, aClass284_12, aClass284_1, aClass284_8, aClass284_3, aClass284_11, aClass284_14 };
	}

	@OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(II)V", line = 118)
	Class284(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3966 = arg0 * -942861193;
		this.anInt3967 = arg1 * -1079157343;
	}

	@OriginalMember(owner = "client!gt", name = "c", descriptor = "()I", line = 124)
	@Override
	public int method36479() {
		return this.anInt3967 * -1127889311;
	}

	@OriginalMember(owner = "client!gt", name = "l", descriptor = "()I", line = 124)
	@Override
	public int method36478() {
		return this.anInt3967 * -1127889311;
	}

	@OriginalMember(owner = "client!gt", name = "y", descriptor = "()I", line = 124)
	@Override
	public int method36477() {
		return this.anInt3967 * -1127889311;
	}

	@OriginalMember(owner = "client!gt", name = "ah", descriptor = "(Lclient!yf;I)V", line = 4505)
	static final void method26713(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 308999563;
	}

	@OriginalMember(owner = "client!gt", name = "bx", descriptor = "(Lclient!yf;I)V", line = 4662)
	static final void method26714(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		if (local8.aClass277_12.anInt3927 * 1365669833 != -1) {
			@Pc(32) Class277 local32 = local8.method33090();
			local32.aClass277Array3[local8.aClass277_12.anInt3927 * 1365669833] = null;
			Class461.method29531(local32);
		} else if (arg0.aBoolean857) {
			throw new RuntimeException("");
		} else {
			throw new RuntimeException("");
		}
	}
}
