package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sl")
public class Class538 {

	@OriginalMember(owner = "client!sl", name = "z", descriptor = "I")
	static final int anInt5191 = 16;

	@OriginalMember(owner = "client!sl", name = "q", descriptor = "I")
	static final int anInt5192 = 14;

	@OriginalMember(owner = "client!sl", name = "v", descriptor = "I")
	static final int anInt5193 = 2;

	@OriginalMember(owner = "client!sl", name = "l", descriptor = "I")
	static final int anInt5194 = 4;

	@OriginalMember(owner = "client!sl", name = "y", descriptor = "I")
	static final int anInt5195 = 2;

	@OriginalMember(owner = "client!sl", name = "w", descriptor = "I")
	static final int anInt5196 = 4;

	@OriginalMember(owner = "client!sl", name = "t", descriptor = "I")
	static final int anInt5197 = 4;

	@OriginalMember(owner = "client!sl", name = "k", descriptor = "I")
	static final int anInt5198 = 8;

	@OriginalMember(owner = "client!sl", name = "x", descriptor = "I")
	static final int anInt5199 = 128;

	@OriginalMember(owner = "client!sl", name = "c", descriptor = "I")
	static final int anInt5200 = 6;

	@OriginalMember(owner = "client!sl", name = "s", descriptor = "I")
	static final int anInt5201 = 4;

	@OriginalMember(owner = "client!sl", name = "d", descriptor = "I")
	static final int anInt5202 = 8;

	@OriginalMember(owner = "client!sl", name = "g", descriptor = "I")
	static final int anInt5203 = 4;

	@OriginalMember(owner = "client!sl", name = "r", descriptor = "I")
	static final int anInt5204 = 16;

	@OriginalMember(owner = "client!sl", name = "j", descriptor = "I")
	static final int anInt5205 = 3;

	@OriginalMember(owner = "client!sl", name = "i", descriptor = "I")
	static final int anInt5206 = 3;

	@OriginalMember(owner = "client!sl", name = "p", descriptor = "I")
	static final int anInt5207 = 12;

	@OriginalMember(owner = "client!sl", name = "u", descriptor = "I")
	static final int anInt5208 = 8;

	@OriginalMember(owner = "client!sl", name = "e", descriptor = "I")
	static final int anInt5209 = 8;

	@OriginalMember(owner = "client!sl", name = "<init>", descriptor = "()V", line = 24)
	Class538() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!sl", name = "q", descriptor = "()I", line = 29)
	static final int method30861() {
		return 0;
	}

	@OriginalMember(owner = "client!sl", name = "x", descriptor = "()I", line = 29)
	static final int method30862() {
		return 0;
	}

	@OriginalMember(owner = "client!sl", name = "d", descriptor = "()I", line = 29)
	static final int method30863() {
		return 0;
	}

	@OriginalMember(owner = "client!sl", name = "s", descriptor = "(I)I", line = 33)
	static final int method30864(@OriginalArg(0) int arg0) {
		if (arg0 < 4) {
			return 0;
		} else if (arg0 < 10) {
			return arg0 - 3;
		} else {
			return arg0 - 6;
		}
	}

	@OriginalMember(owner = "client!sl", name = "r", descriptor = "(I)I", line = 33)
	static final int method30865(@OriginalArg(0) int arg0) {
		if (arg0 < 4) {
			return 0;
		} else if (arg0 < 10) {
			return arg0 - 3;
		} else {
			return arg0 - 6;
		}
	}

	@OriginalMember(owner = "client!sl", name = "g", descriptor = "(I)I", line = 39)
	static final int method30866(@OriginalArg(0) int arg0) {
		return arg0 < 7 ? 7 : 10;
	}

	@OriginalMember(owner = "client!sl", name = "z", descriptor = "(I)I", line = 39)
	static final int method30867(@OriginalArg(0) int arg0) {
		return arg0 < 7 ? 7 : 10;
	}

	@OriginalMember(owner = "client!sl", name = "j", descriptor = "(I)I", line = 39)
	static final int method30868(@OriginalArg(0) int arg0) {
		return arg0 < 7 ? 7 : 10;
	}

	@OriginalMember(owner = "client!sl", name = "i", descriptor = "(I)I", line = 43)
	static final int method30869(@OriginalArg(0) int arg0) {
		return arg0 < 7 ? 8 : 11;
	}

	@OriginalMember(owner = "client!sl", name = "k", descriptor = "(I)I", line = 47)
	static final int method30870(@OriginalArg(0) int arg0) {
		return arg0 < 7 ? 9 : 11;
	}

	@OriginalMember(owner = "client!sl", name = "u", descriptor = "(I)I", line = 47)
	static final int method30871(@OriginalArg(0) int arg0) {
		return arg0 < 7 ? 9 : 11;
	}

	@OriginalMember(owner = "client!sl", name = "e", descriptor = "(I)Z", line = 51)
	static final boolean method30872(@OriginalArg(0) int arg0) {
		return arg0 < 7;
	}

	@OriginalMember(owner = "client!sl", name = "o", descriptor = "(I)I", line = 55)
	static final int method30873(@OriginalArg(0) int arg0) {
		@Pc(0) int local0 = arg0 - 2;
		return local0 < 4 ? local0 : 3;
	}

	@OriginalMember(owner = "client!sl", name = "f", descriptor = "(I)I", line = 55)
	static final int method30874(@OriginalArg(0) int arg0) {
		@Pc(0) int local0 = arg0 - 2;
		return local0 < 4 ? local0 : 3;
	}

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(I)I", line = 55)
	static final int method30875(@OriginalArg(0) int arg0) {
		@Pc(0) int local0 = arg0 - 2;
		return local0 < 4 ? local0 : 3;
	}

	@OriginalMember(owner = "client!sl", name = "n", descriptor = "(I)I", line = 55)
	static final int method30876(@OriginalArg(0) int arg0) {
		@Pc(0) int local0 = arg0 - 2;
		return local0 < 4 ? local0 : 3;
	}

	@OriginalMember(owner = "client!sl", name = "r", descriptor = "(J)I", line = 123)
	public static int method30877(@OriginalArg(0) long arg0) {
		Class694.method36377(arg0);
		return Class61.aCalendar2.get(1);
	}

	@OriginalMember(owner = "client!sl", name = "c", descriptor = "(I)V", line = 207)
	static final void method30878() {
		Class674.anInt5798 -= -672955027;
	}

	@OriginalMember(owner = "client!sl", name = "aox", descriptor = "(Lclient!yf;I)V", line = 12158)
	static final void method30879(@OriginalArg(0) Class665 arg0) {
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub27_2, arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307]);
		Class667.method33150();
		client.aBoolean593 = false;
	}
}
