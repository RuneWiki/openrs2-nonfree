package com.jagex;

import java.util.Stack;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jm")
public class Class346 implements Interface31 {

	@OriginalMember(owner = "client!jm", name = "nu", descriptor = "Lclient!apv;")
	public static Class104_Sub1_Sub1_Sub1_Sub2 aClass104_Sub1_Sub1_Sub1_Sub2_3;

	@OriginalMember(owner = "client!jm", name = "i", descriptor = "Lclient!aar;")
	static Class17 aClass17_12;

	@OriginalMember(owner = "client!jm", name = "l", descriptor = "Lclient!dj;")
	Class94 aClass94_10;

	@OriginalMember(owner = "client!jm", name = "w", descriptor = "I")
	int anInt4488;

	@OriginalMember(owner = "client!jm", name = "y", descriptor = "J")
	long aLong259 = 2139800476556346893L;

	@OriginalMember(owner = "client!jm", name = "c", descriptor = "Lclient!pw;")
	final Class478 aClass478_104;

	@OriginalMember(owner = "client!jm", name = "v", descriptor = "Lclient!pw;")
	final Class478 aClass478_105;

	@OriginalMember(owner = "client!jm", name = "p", descriptor = "Lclient!mm;")
	final Class403 aClass403_1;

	@OriginalMember(owner = "client!jm", name = "p", descriptor = "(ZI)Lclient!te;", line = 15)
	public static Class551 method27844(@OriginalArg(0) boolean arg0) {
		@Pc(2) Stack local2 = Class551.aStack1;
		synchronized (Class551.aStack1) {
			@Pc(10) Class551 local10;
			if (Class551.aStack1.isEmpty()) {
				local10 = new Class551();
			} else {
				local10 = (Class551) Class551.aStack1.pop();
			}
			local10.aBoolean789 = arg0;
			return local10;
		}
	}

	@OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(Lclient!pw;Lclient!pw;Lclient!mm;)V", line = 20)
	Class346(@OriginalArg(0) Class478 arg0, @OriginalArg(1) Class478 arg1, @OriginalArg(2) Class403 arg2) {
		this.aClass478_104 = arg0;
		this.aClass478_105 = arg1;
		this.aClass403_1 = arg2;
	}

	@OriginalMember(owner = "client!jm", name = "c", descriptor = "(ZB)V", line = 27)
	@Override
	public void method27921(@OriginalArg(0) boolean arg0) {
		@Pc(15) int local15 = this.aClass403_1.aClass410_10.method28569(0, client.anInt3394 * -321474631) + this.aClass403_1.anInt4698 * 1897659751;
		@Pc(31) int local31 = this.aClass403_1.aClass402_13.method28502(0, client.anInt3464 * 43072843) + this.aClass403_1.anInt4699 * 882406353;
		@Pc(41) String local41;
		switch(this.aClass403_1.anInt4702 * -1781625265) {
			case 0:
				local41 = Class307.aClass327_1.method27563();
				break;
			case 1:
				local41 = "" + Class307.aClass327_1.method27559() + "%";
				break;
			case 2:
				local41 = Class307.aClass327_1.method27562();
				break;
			default:
				local41 = "";
		}
		@Pc(67) int local67 = Class307.aClass327_1.method27559();
		if (this.aLong259 * -8092573913604323525L < 0L || local67 == 0 || local67 != this.anInt4488 * 1198604243) {
			this.aLong259 = Class280.method26667() * -2139800476556346893L;
			this.anInt4488 = local67 * 614887515;
		}
		if (this.aClass403_1.anInt4702 * -1781625265 != 1 && Class280.method26667() - this.aLong259 * -8092573913604323525L > 10000L) {
			local41 = local41 + " (" + Class307.aClass327_1.method27567().anInt4077 * -1262216053 + ")";
		}
		this.aClass94_10.method7612(local41, local15, local31, this.aClass403_1.anInt4695 * 1112579143, -1);
	}

	@OriginalMember(owner = "client!jm", name = "l", descriptor = "(Z)V", line = 27)
	@Override
	public void method27918(@OriginalArg(0) boolean arg0) {
		@Pc(15) int local15 = this.aClass403_1.aClass410_10.method28569(0, client.anInt3394 * -321474631) + this.aClass403_1.anInt4698 * 1897659751;
		@Pc(31) int local31 = this.aClass403_1.aClass402_13.method28502(0, client.anInt3464 * 43072843) + this.aClass403_1.anInt4699 * 882406353;
		@Pc(41) String local41;
		switch(this.aClass403_1.anInt4702 * -1781625265) {
			case 0:
				local41 = Class307.aClass327_1.method27563();
				break;
			case 1:
				local41 = "" + Class307.aClass327_1.method27559() + "%";
				break;
			case 2:
				local41 = Class307.aClass327_1.method27562();
				break;
			default:
				local41 = "";
		}
		@Pc(67) int local67 = Class307.aClass327_1.method27559();
		if (this.aLong259 * -8092573913604323525L < 0L || local67 == 0 || local67 != this.anInt4488 * 1198604243) {
			this.aLong259 = Class280.method26667() * -2139800476556346893L;
			this.anInt4488 = local67 * 614887515;
		}
		if (this.aClass403_1.anInt4702 * -1781625265 != 1 && Class280.method26667() - this.aLong259 * -8092573913604323525L > 10000L) {
			local41 = local41 + " (" + Class307.aClass327_1.method27567().anInt4077 * -1262216053 + ")";
		}
		this.aClass94_10.method7612(local41, local15, local31, this.aClass403_1.anInt4695 * 1112579143, -1);
	}

	@OriginalMember(owner = "client!jm", name = "q", descriptor = "()Z", line = 64)
	@Override
	public boolean method27916() {
		@Pc(1) boolean local1 = true;
		if (!this.aClass478_104.method29730(this.aClass403_1.anInt4700 * -513306215)) {
			local1 = false;
		}
		if (!this.aClass478_105.method29730(this.aClass403_1.anInt4700 * -513306215)) {
			local1 = false;
		}
		return local1;
	}

	@OriginalMember(owner = "client!jm", name = "v", descriptor = "(I)Z", line = 64)
	@Override
	public boolean method27915() {
		@Pc(1) boolean local1 = true;
		if (!this.aClass478_104.method29730(this.aClass403_1.anInt4700 * -513306215)) {
			local1 = false;
		}
		if (!this.aClass478_105.method29730(this.aClass403_1.anInt4700 * -513306215)) {
			local1 = false;
		}
		return local1;
	}

	@OriginalMember(owner = "client!jm", name = "w", descriptor = "()Z", line = 64)
	@Override
	public boolean method27920() {
		@Pc(1) boolean local1 = true;
		if (!this.aClass478_104.method29730(this.aClass403_1.anInt4700 * -513306215)) {
			local1 = false;
		}
		if (!this.aClass478_105.method29730(this.aClass403_1.anInt4700 * -513306215)) {
			local1 = false;
		}
		return local1;
	}

	@OriginalMember(owner = "client!jm", name = "t", descriptor = "()Z", line = 64)
	@Override
	public boolean method27924() {
		@Pc(1) boolean local1 = true;
		if (!this.aClass478_104.method29730(this.aClass403_1.anInt4700 * -513306215)) {
			local1 = false;
		}
		if (!this.aClass478_105.method29730(this.aClass403_1.anInt4700 * -513306215)) {
			local1 = false;
		}
		return local1;
	}

	@OriginalMember(owner = "client!jm", name = "x", descriptor = "()Z", line = 64)
	@Override
	public boolean method27923() {
		@Pc(1) boolean local1 = true;
		if (!this.aClass478_104.method29730(this.aClass403_1.anInt4700 * -513306215)) {
			local1 = false;
		}
		if (!this.aClass478_105.method29730(this.aClass403_1.anInt4700 * -513306215)) {
			local1 = false;
		}
		return local1;
	}

	@OriginalMember(owner = "client!jm", name = "d", descriptor = "()Z", line = 64)
	@Override
	public boolean method27922() {
		@Pc(1) boolean local1 = true;
		if (!this.aClass478_104.method29730(this.aClass403_1.anInt4700 * -513306215)) {
			local1 = false;
		}
		if (!this.aClass478_105.method29730(this.aClass403_1.anInt4700 * -513306215)) {
			local1 = false;
		}
		return local1;
	}

	@OriginalMember(owner = "client!jm", name = "p", descriptor = "(S)V", line = 71)
	@Override
	public void method27917() {
		@Pc(10) Class17 local10 = Class21.method418(this.aClass478_105, this.aClass403_1.anInt4700 * -513306215, Class367.aClass415_1);
		this.aClass94_10 = Class284.aClass86_9.method20111(local10, Class210.method25600(this.aClass478_104, this.aClass403_1.anInt4700 * -513306215), true);
	}

	@OriginalMember(owner = "client!jm", name = "y", descriptor = "()V", line = 71)
	@Override
	public void method27919() {
		@Pc(10) Class17 local10 = Class21.method418(this.aClass478_105, this.aClass403_1.anInt4700 * -513306215, Class367.aClass415_1);
		this.aClass94_10 = Class284.aClass86_9.method20111(local10, Class210.method25600(this.aClass478_104, this.aClass403_1.anInt4700 * -513306215), true);
	}

	@OriginalMember(owner = "client!jm", name = "s", descriptor = "(IB)I", line = 76)
	public static int method27845(@OriginalArg(0) int arg0) {
		@Pc(5) Class77_Sub1_Sub14 local5 = (Class77_Sub1_Sub14) Class304.aClass12_31.method173((long) arg0);
		if (local5 == null) {
			return -1;
		} else if (Class304.aClass691_14.aClass77_Sub1_66 == local5.aClass77_Sub1_61) {
			return -1;
		} else {
			return ((Class77_Sub1_Sub14) local5.aClass77_Sub1_61).anInt3043 * -759944081;
		}
	}

	@OriginalMember(owner = "client!jm", name = "vp", descriptor = "(Lclient!yf;I)V", line = 8422)
	static final void method27846(@OriginalArg(0) Class665 arg0) {
		@Pc(15) Class77_Sub36 local15 = Class96_Sub18.method7709((Class77_Sub36) arg0.anObjectArray45[(arg0.anInt5781 -= 1460193483) * 1485266147]);
		arg0.anInt5784 -= 1235998252;
		local15.anInt1776 += arg0.anIntArray536[arg0.anInt5784 * 2088438307] * 1166548959;
		local15.anInt1777 += arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1] * -1224142395;
		local15.anInt1778 += arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 2] * -1544617399;
		local15.anInt1779 += arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 3] * 646265707;
		arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = local15;
	}

	@OriginalMember(owner = "client!jm", name = "ayi", descriptor = "(Lclient!yf;I)V", line = 13583)
	static final void method27847(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 1;
	}
}
