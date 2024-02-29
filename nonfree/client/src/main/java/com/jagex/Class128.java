package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ss")
public class Class128 {

	@OriginalMember(owner = "client!ss", name = "bo", descriptor = "Lclient!yi;")
	public static Class667 aClass667_3;

	// $FF: synthetic field
	@OriginalMember(owner = "client!ss", name = "this$0", descriptor = "Lclient!sx;")
	final Class546 this$0;

	@OriginalMember(owner = "client!ss", name = "p", descriptor = "[Lclient!jx;")
	Class352[] aClass352Array4;

	@OriginalMember(owner = "client!ss", name = "c", descriptor = "[Lclient!jx;")
	Class352[] aClass352Array3;

	@OriginalMember(owner = "client!ss", name = "t", descriptor = "(I)V", line = 45)
	public static void method11789() {
		if (client.anInt3390 * -1850530127 != 16 && client.anInt3390 * -1850530127 != 3 || client.aClass82_2 == null) {
			return;
		}
		while (true) {
			@Pc(17) Interface67 local17 = (Interface67) Class575.aLinkedList8.poll();
			if (local17 == null) {
				return;
			}
			local17.method31719();
		}
	}

	@OriginalMember(owner = "client!ss", name = "<init>", descriptor = "(Lclient!sx;)V", line = 65)
	Class128(@OriginalArg(0) Class546 arg0) {
		this.this$0 = arg0;
		this.aClass352Array4 = new Class352[16];
		this.aClass352Array3 = new Class352[16];
		new Class352(8);
		for (@Pc(19) int local19 = 0; local19 < 16; local19++) {
			this.aClass352Array4[local19] = new Class352(3);
			this.aClass352Array3[local19] = new Class352(3);
		}
	}

	@OriginalMember(owner = "client!ss", name = "nt", descriptor = "(Lclient!yf;I)V", line = 7072)
	static final void method11790(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class562.method31324(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!ss", name = "pu", descriptor = "(Lclient!yf;B)V", line = 7321)
	static final void method11791(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class85.method4908(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!ss", name = "un", descriptor = "(Lclient!yf;B)V", line = 8212)
	static final void method11792(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 1235998252;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		@Pc(33) int local33 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 2];
		@Pc(43) int local43 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 3];
		@Pc(45) short local45 = 256;
		Class94_Sub4.aClass261_1.method26335(Class239.aClass239_9, local13, local23, local43, Class220.aClass220_8.method25727(), Class235.aClass235_2, 0.0F, 0.0F, null, 0, local45, local33);
	}

	@OriginalMember(owner = "client!ss", name = "aks", descriptor = "(Lclient!yf;I)V", line = 11285)
	static final void method11793(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 1235998252;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		@Pc(33) int local33 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 2];
		@Pc(43) int local43 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 3];
		@Pc(47) Class595 local47 = client.aClass517_1.method30409();
		Class600.method32038((local13 >> 14 & 0x3FFF) - local47.anInt5504 * -424199969, (local13 & 0x3FFF) - local47.anInt5506 * -1166289421, local23 << 2, local33, local43);
		client.aBoolean612 = true;
	}
}
