package com.jagex;

import java.util.Iterator;
import java.util.LinkedList;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public class Class242 {

	@OriginalMember(owner = "client!fc", name = "v", descriptor = "I")
	int anInt3789 = 2144460233;

	@OriginalMember(owner = "client!fc", name = "l", descriptor = "Ljava/util/LinkedList;")
	LinkedList aLinkedList1 = new LinkedList();

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "Lclient!fo;")
	final Interface26 anInterface26_2;

	@OriginalMember(owner = "client!fc", name = "p", descriptor = "J")
	final long aLong247;

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Lclient!akv;Lclient!fo;)V", line = 16)
	public Class242(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) Interface26 arg1) {
		this.anInterface26_2 = arg1;
		this.aLong247 = arg0.method22510() * 6924331327065729413L;
		this.anInt3789 = arg0.method22500() * -2144460233;
		for (@Pc(30) int local30 = arg0.method22478(); local30 != 0; local30 = arg0.method22478()) {
			@Pc(39) Class284 local39 = (Class284) Class457.method29479(Class284.method26710(), local30);
			@Pc(49) Object local49;
			switch(local39.anInt3966 * -598801081) {
				case 0:
					local49 = new Class259(this, arg0);
					break;
				case 1:
					local49 = new Class246(this, arg0);
					break;
				case 2:
					local49 = new Class268(this, arg0);
					break;
				case 3:
					local49 = new Class262(this, arg0);
					break;
				case 4:
					local49 = new Class247(this, arg0);
					break;
				case 5:
					local49 = new Class263(this, arg0);
					break;
				case 6:
					local49 = new Class256(this, arg0);
					break;
				case 7:
					local49 = new Class245(this, arg0);
					break;
				case 8:
					local49 = new Class289(this, arg0);
					break;
				case 9:
					local49 = new Class257(this, arg0);
					break;
				case 10:
					local49 = new Class253(this);
					break;
				case 11:
					local49 = new Class274(this);
					break;
				case 12:
					local49 = new Class249(this, arg0);
					break;
				case 13:
					local49 = new Class266(this, arg0);
					break;
				default:
					throw new IllegalStateException("");
			}
			this.aLinkedList1.add(local49);
		}
	}

	@OriginalMember(owner = "client!fc", name = "v", descriptor = "(I)V", line = 37)
	public static void method26014() {
		if (Class637.aClass117_6 != null) {
			Class637.aClass117_6.method10879();
		}
	}

	@OriginalMember(owner = "client!fc", name = "g", descriptor = "(Lclient!yf;I)V", line = 65)
	static void method26015(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[arg0.anInt5784 * 2088438307 - 2] = ((Class303) Class252.aClass42_Sub2_1.method18319(arg0.anIntArray536[arg0.anInt5784 * 2088438307 - 2])).anIntArrayArray50[arg0.anIntArray536[arg0.anInt5784 * 2088438307 - 1]][0];
		arg0.anInt5784 -= 308999563;
	}

	@OriginalMember(owner = "client!fc", name = "p", descriptor = "(Lclient!fd;I)V", line = 76)
	public void method26016(@OriginalArg(0) Class243 arg0) {
		if (this.aLong247 * 2968070032055265101L != arg0.aLong248 * -7721770475843032135L || arg0.method26028() != this.anInt3789 * -1904397433) {
			throw new IllegalStateException("");
		}
		@Pc(26) Iterator local26 = this.aLinkedList1.iterator();
		while (local26.hasNext()) {
			@Pc(33) Interface27 local33 = (Interface27) local26.next();
			local33.method26978(arg0);
		}
		arg0.method26029();
	}

	@OriginalMember(owner = "client!fc", name = "v", descriptor = "(Lclient!fd;)V", line = 76)
	public void method26017(@OriginalArg(0) Class243 arg0) {
		if (this.aLong247 * 2968070032055265101L != arg0.aLong248 * -7721770475843032135L || arg0.method26028() != this.anInt3789 * -1904397433) {
			throw new IllegalStateException("");
		}
		@Pc(26) Iterator local26 = this.aLinkedList1.iterator();
		while (local26.hasNext()) {
			@Pc(33) Interface27 local33 = (Interface27) local26.next();
			local33.method26978(arg0);
		}
		arg0.method26029();
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(Lclient!fd;)V", line = 76)
	public void method26018(@OriginalArg(0) Class243 arg0) {
		if (this.aLong247 * 2968070032055265101L != arg0.aLong248 * -7721770475843032135L || arg0.method26028() != this.anInt3789 * -1904397433) {
			throw new IllegalStateException("");
		}
		@Pc(26) Iterator local26 = this.aLinkedList1.iterator();
		while (local26.hasNext()) {
			@Pc(33) Interface27 local33 = (Interface27) local26.next();
			local33.method26978(arg0);
		}
		arg0.method26029();
	}

	@OriginalMember(owner = "client!fc", name = "s", descriptor = "(I)Lclient!zp;", line = 132)
	public static Class698 method26019() {
		return Class293.aClass698_1 == null ? Class698.aClass698_7 : Class293.aClass698_1;
	}

	@OriginalMember(owner = "client!fc", name = "au", descriptor = "(Lclient!gm;III)V", line = 943)
	static void method26020(@OriginalArg(0) Class277 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Class683.aClass277_13 = arg0;
		Class683.anInt5823 = arg1 * 1370224745;
		Class683.anInt5830 = arg2 * -590395525;
	}

	@OriginalMember(owner = "client!fc", name = "wz", descriptor = "(Lclient!yf;B)V", line = 8609)
	static final void method26021(@OriginalArg(0) Class665 arg0) {
		@Pc(2) Class77_Sub1_Sub7 local2 = Class639.method32724();
		if (Class510.method30318(local2) == 4) {
			@Pc(14) Class77_Sub6 local14 = (Class77_Sub6) client.aClass12_22.method173(local2.method21627());
			if (local14 != null) {
				arg0.aClass104_Sub1_Sub1_Sub1_4 = (Class104_Sub1_Sub1_Sub1) local14.anObject5;
				arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 1;
				return;
			}
		}
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
	}

	@OriginalMember(owner = "client!fc", name = "lj", descriptor = "(Ljava/lang/String;II)V", line = 11980)
	public static final void method26022(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Class82 local2 = Class230.method25826();
		@Pc(8) Class77_Sub20 local8 = Class365.method28132(Class414.aClass414_76, local2.aClass16_1);
		local8.aClass77_Sub39_Sub1_2.method22403(Class664.method33107(arg0) + 1);
		local8.aClass77_Sub39_Sub1_2.method22440(arg0);
		local8.aClass77_Sub39_Sub1_2.method22583(arg1);
		local2.method2004(local8);
	}
}
