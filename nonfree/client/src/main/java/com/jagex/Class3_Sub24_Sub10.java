package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!alq")
public class Class3_Sub24_Sub10 extends Class3_Sub24 {

	@OriginalMember(owner = "client!alq", name = "h", descriptor = "Z")
	boolean aBoolean462;

	// $FF: synthetic field
	@OriginalMember(owner = "client!alq", name = "this$0", descriptor = "Lclient!iq;")
	final Class242 this$0;

	@OriginalMember(owner = "client!alq", name = "l", descriptor = "I")
	int anInt2607;

	@OriginalMember(owner = "client!alq", name = "<init>", descriptor = "(Lclient!iq;)V", line = 165)
	Class3_Sub24_Sub10(@OriginalArg(0) Class242 arg0) {
		this.this$0 = arg0;
		this.anInt2607 = -831536345;
	}

	@OriginalMember(owner = "client!alq", name = "p", descriptor = "(Lclient!ahb;B)V", line = 168)
	@Override
	void method18644(@OriginalArg(0) Class3_Sub41 arg0) {
		this.anInt2607 = arg0.method20271() * 831536345;
		this.aBoolean462 = arg0.method20269() == 1;
	}

	@OriginalMember(owner = "client!alq", name = "x", descriptor = "(Lclient!ahb;)V", line = 168)
	@Override
	void method18645(@OriginalArg(0) Class3_Sub41 arg0) {
		this.anInt2607 = arg0.method20271() * 831536345;
		this.aBoolean462 = arg0.method20269() == 1;
	}

	@OriginalMember(owner = "client!alq", name = "g", descriptor = "(Lclient!ahb;)V", line = 168)
	@Override
	void method18649(@OriginalArg(0) Class3_Sub41 arg0) {
		this.anInt2607 = arg0.method20271() * 831536345;
		this.aBoolean462 = arg0.method20269() == 1;
	}

	@OriginalMember(owner = "client!alq", name = "l", descriptor = "(Lclient!ahb;)V", line = 168)
	@Override
	void method18646(@OriginalArg(0) Class3_Sub41 arg0) {
		this.anInt2607 = arg0.method20271() * 831536345;
		this.aBoolean462 = arg0.method20269() == 1;
	}

	@OriginalMember(owner = "client!alq", name = "h", descriptor = "(Lclient!ahb;)V", line = 168)
	@Override
	void method18647(@OriginalArg(0) Class3_Sub41 arg0) {
		this.anInt2607 = arg0.method20271() * 831536345;
		this.aBoolean462 = arg0.method20269() == 1;
	}

	@OriginalMember(owner = "client!alq", name = "a", descriptor = "(Lclient!iu;I)V", line = 173)
	@Override
	void method18643(@OriginalArg(0) Class245 arg0) {
		arg0.method24838(this.anInt2607 * -1579908247, this.aBoolean462);
	}

	@OriginalMember(owner = "client!alq", name = "s", descriptor = "(Lclient!iu;)V", line = 173)
	@Override
	void method18648(@OriginalArg(0) Class245 arg0) {
		arg0.method24838(this.anInt2607 * -1579908247, this.aBoolean462);
	}

	@OriginalMember(owner = "client!alq", name = "lg", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V", line = 11355)
	public static final void method18350(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		@Pc(2) Class82 local2 = Class406.method27657();
		@Pc(8) Class3_Sub23 local8 = Class269.method25284(Class311.aClass311_42, local2.aClass577_2);
		if (arg1.length() > 30) {
			arg1 = arg1.substring(0, 30);
		}
		local8.aClass3_Sub41_Sub1_1.method20250(Class43_Sub2.method8763(arg0) + Class43_Sub2.method8763(arg1));
		local8.aClass3_Sub41_Sub1_1.method20260(arg0);
		local8.aClass3_Sub41_Sub1_1.method20260(arg1);
		local2.method21601(local8);
	}
}
