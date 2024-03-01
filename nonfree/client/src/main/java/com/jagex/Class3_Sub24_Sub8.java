package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aln")
public class Class3_Sub24_Sub8 extends Class3_Sub24 {

	@OriginalMember(owner = "client!aln", name = "h", descriptor = "B")
	byte aByte80;

	// $FF: synthetic field
	@OriginalMember(owner = "client!aln", name = "this$0", descriptor = "Lclient!iq;")
	final Class242 this$0;

	@OriginalMember(owner = "client!aln", name = "l", descriptor = "I")
	int anInt2606;

	@OriginalMember(owner = "client!aln", name = "<init>", descriptor = "(Lclient!iq;)V", line = 129)
	Class3_Sub24_Sub8(@OriginalArg(0) Class242 arg0) {
		this.this$0 = arg0;
		this.anInt2606 = 1752385329;
	}

	@OriginalMember(owner = "client!aln", name = "p", descriptor = "(Lclient!ahb;B)V", line = 132)
	@Override
	void method18644(@OriginalArg(0) Class3_Sub41 arg0) {
		this.anInt2606 = arg0.method20271() * -1752385329;
		this.aByte80 = arg0.method20390();
	}

	@OriginalMember(owner = "client!aln", name = "g", descriptor = "(Lclient!ahb;)V", line = 132)
	@Override
	void method18649(@OriginalArg(0) Class3_Sub41 arg0) {
		this.anInt2606 = arg0.method20271() * -1752385329;
		this.aByte80 = arg0.method20390();
	}

	@OriginalMember(owner = "client!aln", name = "x", descriptor = "(Lclient!ahb;)V", line = 132)
	@Override
	void method18645(@OriginalArg(0) Class3_Sub41 arg0) {
		this.anInt2606 = arg0.method20271() * -1752385329;
		this.aByte80 = arg0.method20390();
	}

	@OriginalMember(owner = "client!aln", name = "l", descriptor = "(Lclient!ahb;)V", line = 132)
	@Override
	void method18646(@OriginalArg(0) Class3_Sub41 arg0) {
		this.anInt2606 = arg0.method20271() * -1752385329;
		this.aByte80 = arg0.method20390();
	}

	@OriginalMember(owner = "client!aln", name = "h", descriptor = "(Lclient!ahb;)V", line = 132)
	@Override
	void method18647(@OriginalArg(0) Class3_Sub41 arg0) {
		this.anInt2606 = arg0.method20271() * -1752385329;
		this.aByte80 = arg0.method20390();
	}

	@OriginalMember(owner = "client!aln", name = "a", descriptor = "(Lclient!iu;I)V", line = 137)
	@Override
	void method18643(@OriginalArg(0) Class245 arg0) {
		arg0.method24815(this.anInt2606 * -701149649, this.aByte80);
	}

	@OriginalMember(owner = "client!aln", name = "s", descriptor = "(Lclient!iu;)V", line = 137)
	@Override
	void method18648(@OriginalArg(0) Class245 arg0) {
		arg0.method24815(this.anInt2606 * -701149649, this.aByte80);
	}
}
