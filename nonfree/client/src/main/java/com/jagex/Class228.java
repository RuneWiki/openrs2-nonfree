package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!el")
public class Class228 {

	@OriginalMember(owner = "client!el", name = "p", descriptor = "Lclient!el;")
	static final Class228 aClass228_2 = new Class228(2);

	@OriginalMember(owner = "client!el", name = "c", descriptor = "Lclient!el;")
	static final Class228 aClass228_4 = new Class228(3);

	@OriginalMember(owner = "client!el", name = "v", descriptor = "Lclient!el;")
	static final Class228 aClass228_3 = new Class228(1);

	@OriginalMember(owner = "client!el", name = "l", descriptor = "Lclient!el;")
	static final Class228 aClass228_1 = new Class228(0);

	@OriginalMember(owner = "client!el", name = "y", descriptor = "Lclient!el;")
	static final Class228 aClass228_5 = new Class228(4);

	@OriginalMember(owner = "client!el", name = "w", descriptor = "Lclient!el;")
	static final Class228 aClass228_6 = new Class228(5);

	@OriginalMember(owner = "client!el", name = "t", descriptor = "I")
	final int anInt3754;

	@OriginalMember(owner = "client!el", name = "<init>", descriptor = "(I)V", line = 13)
	Class228(@OriginalArg(0) int arg0) {
		this.anInt3754 = arg0 * -2029631893;
	}

	@OriginalMember(owner = "client!el", name = "p", descriptor = "(B)I", line = 18)
	int method25803() {
		return aClass228_2 == this ? -1 : -641518013 * this.anInt3754 | 0x1000000;
	}

	@OriginalMember(owner = "client!el", name = "c", descriptor = "()I", line = 18)
	int method25804() {
		return aClass228_2 == this ? -1 : -641518013 * this.anInt3754 | 0x1000000;
	}

	@OriginalMember(owner = "client!el", name = "v", descriptor = "()I", line = 18)
	int method25805() {
		return aClass228_2 == this ? -1 : -641518013 * this.anInt3754 | 0x1000000;
	}

	@OriginalMember(owner = "client!el", name = "l", descriptor = "()I", line = 18)
	int method25806() {
		return aClass228_2 == this ? -1 : -641518013 * this.anInt3754 | 0x1000000;
	}

	@OriginalMember(owner = "client!el", name = "qw", descriptor = "(Lclient!yf;I)V", line = 7541)
	static final void method25807(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local11.anInt3888 * -1866862435 == 1 ? local11.anInt3889 * 939166901 : -1;
	}

	@OriginalMember(owner = "client!el", name = "wv", descriptor = "(Lclient!yf;I)V", line = 8596)
	static final void method25808(@OriginalArg(0) Class665 arg0) {
		Class148.method15595(Class639.method32724(), arg0);
	}

	@OriginalMember(owner = "client!el", name = "ado", descriptor = "(Lclient!yf;I)V", line = 9760)
	static final void method25809(@OriginalArg(0) Class665 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt5781 -= 1460193483) * 1485266147];
		@Pc(26) int local26 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		if (local26 == -1) {
			throw new RuntimeException("");
		}
		arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = local13 + (char) local26;
	}

	@OriginalMember(owner = "client!el", name = "ahk", descriptor = "(Lclient!yf;I)V", line = 10646)
	static final void method25810(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = -1;
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = -1;
	}
}
