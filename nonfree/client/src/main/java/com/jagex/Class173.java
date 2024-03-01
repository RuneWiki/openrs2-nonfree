package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fi")
public class Class173 {

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "I")
	static final int anInt3468 = 4;

	@OriginalMember(owner = "client!fi", name = "g", descriptor = "I")
	static final int anInt3469 = 256;

	@OriginalMember(owner = "client!fi", name = "s", descriptor = "I")
	static final int anInt3470 = 2;

	@OriginalMember(owner = "client!fi", name = "l", descriptor = "[Lclient!fr;")
	Class181[] aClass181Array1;

	@OriginalMember(owner = "client!fi", name = "x", descriptor = "[Lclient!ff;")
	Class170[] aClass170Array1;

	@OriginalMember(owner = "client!fi", name = "h", descriptor = "[Lclient!fr;")
	Class181[] aClass181Array2;

	@OriginalMember(owner = "client!fi", name = "p", descriptor = "Ljava/lang/String;")
	String aString166;

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "([B)V", line = 13)
	public Class173(@OriginalArg(0) byte[] arg0) throws Exception_Sub7 {
		this.method23384(arg0);
	}

	@OriginalMember(owner = "client!fi", name = "g", descriptor = "([B)V", line = 18)
	void method23382(@OriginalArg(0) byte[] arg0) throws Exception_Sub7 {
		@Pc(4) Class174 local4 = new Class174(arg0);
		@Pc(8) int local8 = local4.method23393();
		if (local8 != 4) {
			throw new Exception_Sub7(this, local8, 4);
		}
		this.aString166 = local4.method23391();
		this.aClass181Array1 = new Class181[local4.method23393()];
		this.aClass181Array2 = new Class181[local4.method23393()];
		this.aClass170Array1 = new Class170[local4.method23393()];
		@Pc(43) int local43;
		for (local43 = 0; local43 < this.aClass181Array1.length; local43++) {
			this.aClass181Array1[local43] = new Class181();
			this.aClass181Array1[local43].method23543(local4);
		}
		for (local43 = 0; local43 < this.aClass181Array2.length; local43++) {
			this.aClass181Array2[local43] = new Class181();
			this.aClass181Array2[local43].method23543(local4);
		}
		for (local43 = 0; local43 < this.aClass170Array1.length; local43++) {
			this.aClass170Array1[local43] = new Class170();
			this.aClass170Array1[local43].method23357(local4);
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "([B)V", line = 18)
	void method23383(@OriginalArg(0) byte[] arg0) throws Exception_Sub7 {
		@Pc(4) Class174 local4 = new Class174(arg0);
		@Pc(8) int local8 = local4.method23393();
		if (local8 != 4) {
			throw new Exception_Sub7(this, local8, 4);
		}
		this.aString166 = local4.method23391();
		this.aClass181Array1 = new Class181[local4.method23393()];
		this.aClass181Array2 = new Class181[local4.method23393()];
		this.aClass170Array1 = new Class170[local4.method23393()];
		@Pc(43) int local43;
		for (local43 = 0; local43 < this.aClass181Array1.length; local43++) {
			this.aClass181Array1[local43] = new Class181();
			this.aClass181Array1[local43].method23543(local4);
		}
		for (local43 = 0; local43 < this.aClass181Array2.length; local43++) {
			this.aClass181Array2[local43] = new Class181();
			this.aClass181Array2[local43].method23543(local4);
		}
		for (local43 = 0; local43 < this.aClass170Array1.length; local43++) {
			this.aClass170Array1[local43] = new Class170();
			this.aClass170Array1[local43].method23357(local4);
		}
	}

	@OriginalMember(owner = "client!fi", name = "p", descriptor = "([BB)V", line = 18)
	void method23384(@OriginalArg(0) byte[] arg0) throws Exception_Sub7 {
		@Pc(4) Class174 local4 = new Class174(arg0);
		@Pc(8) int local8 = local4.method23393();
		if (local8 != 4) {
			throw new Exception_Sub7(this, local8, 4);
		}
		this.aString166 = local4.method23391();
		this.aClass181Array1 = new Class181[local4.method23393()];
		this.aClass181Array2 = new Class181[local4.method23393()];
		this.aClass170Array1 = new Class170[local4.method23393()];
		@Pc(43) int local43;
		for (local43 = 0; local43 < this.aClass181Array1.length; local43++) {
			this.aClass181Array1[local43] = new Class181();
			this.aClass181Array1[local43].method23543(local4);
		}
		for (local43 = 0; local43 < this.aClass181Array2.length; local43++) {
			this.aClass181Array2[local43] = new Class181();
			this.aClass181Array2[local43].method23543(local4);
		}
		for (local43 = 0; local43 < this.aClass170Array1.length; local43++) {
			this.aClass170Array1[local43] = new Class170();
			this.aClass170Array1[local43].method23357(local4);
		}
	}

	@OriginalMember(owner = "client!fi", name = "l", descriptor = "([B)V", line = 18)
	void method23385(@OriginalArg(0) byte[] arg0) throws Exception_Sub7 {
		@Pc(4) Class174 local4 = new Class174(arg0);
		@Pc(8) int local8 = local4.method23393();
		if (local8 != 4) {
			throw new Exception_Sub7(this, local8, 4);
		}
		this.aString166 = local4.method23391();
		this.aClass181Array1 = new Class181[local4.method23393()];
		this.aClass181Array2 = new Class181[local4.method23393()];
		this.aClass170Array1 = new Class170[local4.method23393()];
		@Pc(43) int local43;
		for (local43 = 0; local43 < this.aClass181Array1.length; local43++) {
			this.aClass181Array1[local43] = new Class181();
			this.aClass181Array1[local43].method23543(local4);
		}
		for (local43 = 0; local43 < this.aClass181Array2.length; local43++) {
			this.aClass181Array2[local43] = new Class181();
			this.aClass181Array2[local43].method23543(local4);
		}
		for (local43 = 0; local43 < this.aClass170Array1.length; local43++) {
			this.aClass170Array1[local43] = new Class170();
			this.aClass170Array1[local43].method23357(local4);
		}
	}

	@OriginalMember(owner = "client!fi", name = "h", descriptor = "([B)V", line = 18)
	void method23386(@OriginalArg(0) byte[] arg0) throws Exception_Sub7 {
		@Pc(4) Class174 local4 = new Class174(arg0);
		@Pc(8) int local8 = local4.method23393();
		if (local8 != 4) {
			throw new Exception_Sub7(this, local8, 4);
		}
		this.aString166 = local4.method23391();
		this.aClass181Array1 = new Class181[local4.method23393()];
		this.aClass181Array2 = new Class181[local4.method23393()];
		this.aClass170Array1 = new Class170[local4.method23393()];
		@Pc(43) int local43;
		for (local43 = 0; local43 < this.aClass181Array1.length; local43++) {
			this.aClass181Array1[local43] = new Class181();
			this.aClass181Array1[local43].method23543(local4);
		}
		for (local43 = 0; local43 < this.aClass181Array2.length; local43++) {
			this.aClass181Array2[local43] = new Class181();
			this.aClass181Array2[local43].method23543(local4);
		}
		for (local43 = 0; local43 < this.aClass170Array1.length; local43++) {
			this.aClass170Array1[local43] = new Class170();
			this.aClass170Array1[local43].method23357(local4);
		}
	}

	@OriginalMember(owner = "client!fi", name = "x", descriptor = "([B)V", line = 18)
	void method23387(@OriginalArg(0) byte[] arg0) throws Exception_Sub7 {
		@Pc(4) Class174 local4 = new Class174(arg0);
		@Pc(8) int local8 = local4.method23393();
		if (local8 != 4) {
			throw new Exception_Sub7(this, local8, 4);
		}
		this.aString166 = local4.method23391();
		this.aClass181Array1 = new Class181[local4.method23393()];
		this.aClass181Array2 = new Class181[local4.method23393()];
		this.aClass170Array1 = new Class170[local4.method23393()];
		@Pc(43) int local43;
		for (local43 = 0; local43 < this.aClass181Array1.length; local43++) {
			this.aClass181Array1[local43] = new Class181();
			this.aClass181Array1[local43].method23543(local4);
		}
		for (local43 = 0; local43 < this.aClass181Array2.length; local43++) {
			this.aClass181Array2[local43] = new Class181();
			this.aClass181Array2[local43].method23543(local4);
		}
		for (local43 = 0; local43 < this.aClass170Array1.length; local43++) {
			this.aClass170Array1[local43] = new Class170();
			this.aClass170Array1[local43].method23357(local4);
		}
	}

	@OriginalMember(owner = "client!fi", name = "gz", descriptor = "(I)V", line = 3205)
	static final void method23389() {
		@Pc(1) int[] local1 = Class52.anIntArray167;
		@Pc(3) int local3;
		for (local3 = 0; local3 < Class52.anInt1127 * 701602229; local3++) {
			@Pc(14) Class26_Sub1_Sub1_Sub1_Sub2 local14 = client.aClass26_Sub1_Sub1_Sub1_Sub2Array1[local1[local3]];
			if (local14 != null) {
				local14.method16652();
			}
		}
		for (local3 = 0; local3 < client.anInt3163 * 1758488217; local3++) {
			@Pc(34) long local34 = (long) client.anIntArray303[local3];
			@Pc(39) Class3_Sub29 local39 = (Class3_Sub29) client.aClass581_21.method33217(local34);
			if (local39 != null) {
				((Class26_Sub1_Sub1_Sub1) local39.anObject2).method16652();
			}
		}
		if (client.anInt3065 * -1773414811 != 2) {
			return;
		}
		for (local3 = 0; local3 < Class131.aClass163Array1.length; local3++) {
			@Pc(65) Class163 local65 = Class131.aClass163Array1[local3];
			if (local65.aBoolean623) {
				local65.method23278().method16652();
			}
		}
	}

	@OriginalMember(owner = "client!fi", name = "qn", descriptor = "(Lclient!vs;B)V", line = 7134)
	static final void method23388(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		Class385.method27334(local11, arg0);
	}
}
