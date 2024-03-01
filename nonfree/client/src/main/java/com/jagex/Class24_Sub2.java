package com.jagex;

import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!acp")
public class Class24_Sub2 extends Class24 {

	@OriginalMember(owner = "client!acp", name = "b", descriptor = "Lclient!acj;")
	Class25_Sub2 aClass25_Sub2_1;

	@OriginalMember(owner = "client!acp", name = "c", descriptor = "I")
	int anInt674;

	@OriginalMember(owner = "client!acp", name = "y", descriptor = "Lclient!akk;")
	final Class21_Sub3_Sub1 aClass21_Sub3_Sub1_2;

	@OriginalMember(owner = "client!acp", name = "<init>", descriptor = "(Lclient!akk;Lclient!fi;)V", line = 15)
	Class24_Sub2(@OriginalArg(0) Class21_Sub3_Sub1 arg0, @OriginalArg(1) Class173 arg1) {
		super(arg0, arg1);
		this.aClass21_Sub3_Sub1_2 = arg0;
	}

	@OriginalMember(owner = "client!acp", name = "h", descriptor = "(Lclient!abv;Lclient!ff;)Lclient!fk;", line = 20)
	@Override
	Class25 method6582(@OriginalArg(0) Class21_Sub3 arg0, @OriginalArg(1) Class170 arg1) {
		return new Class25_Sub2((Class21_Sub3_Sub1) arg0, this, arg1);
	}

	@OriginalMember(owner = "client!acp", name = "aw", descriptor = "(Lclient!abv;Lclient!ff;)Lclient!fk;", line = 20)
	@Override
	Class25 method6600(@OriginalArg(0) Class21_Sub3 arg0, @OriginalArg(1) Class170 arg1) {
		return new Class25_Sub2((Class21_Sub3_Sub1) arg0, this, arg1);
	}

	@OriginalMember(owner = "client!acp", name = "c", descriptor = "(Lclient!fk;)Z", line = 24)
	@Override
	public boolean method6560(@OriginalArg(0) Class25 arg0) {
		if (this.aClass25_Sub2_1 == arg0) {
			return true;
		} else if (arg0.method6418()) {
			@Pc(13) boolean local13 = this.method6574();
			this.aClass25_Sub2_1 = (Class25_Sub2) arg0;
			this.anInt673 = this.method6592(arg0) * 1845711215;
			if (this.anInt673 * 1375415695 == -1) {
				throw new IllegalArgumentException();
			}
			this.anInt674 = this.aClass25_Sub2_1.anInt629;
			if (local13) {
				OpenGL.glUseProgram(this.anInt674);
				this.aClass21_Sub3_Sub1_2.aClass25_Sub2_2 = this.aClass25_Sub2_1;
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!acp", name = "dc", descriptor = "(Lclient!fk;)Z", line = 24)
	@Override
	public boolean method6664(@OriginalArg(0) Class25 arg0) {
		if (this.aClass25_Sub2_1 == arg0) {
			return true;
		} else if (arg0.method6418()) {
			@Pc(13) boolean local13 = this.method6574();
			this.aClass25_Sub2_1 = (Class25_Sub2) arg0;
			this.anInt673 = this.method6592(arg0) * 1845711215;
			if (this.anInt673 * 1375415695 == -1) {
				throw new IllegalArgumentException();
			}
			this.anInt674 = this.aClass25_Sub2_1.anInt629;
			if (local13) {
				OpenGL.glUseProgram(this.anInt674);
				this.aClass21_Sub3_Sub1_2.aClass25_Sub2_2 = this.aClass25_Sub2_1;
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!acp", name = "by", descriptor = "(Lclient!fr;)Lclient!alr;", line = 39)
	@Override
	Class3_Sub19_Sub1 method6613(@OriginalArg(0) Class181 arg0) {
		return new Class3_Sub19_Sub1_Sub2(this, arg0);
	}

	@OriginalMember(owner = "client!acp", name = "bl", descriptor = "(Lclient!fr;)Lclient!alr;", line = 39)
	@Override
	Class3_Sub19_Sub1 method6614(@OriginalArg(0) Class181 arg0) {
		return new Class3_Sub19_Sub1_Sub2(this, arg0);
	}

	@OriginalMember(owner = "client!acp", name = "n", descriptor = "(Lclient!fr;)Lclient!alr;", line = 39)
	@Override
	Class3_Sub19_Sub1 method6563(@OriginalArg(0) Class181 arg0) {
		return new Class3_Sub19_Sub1_Sub2(this, arg0);
	}

	@OriginalMember(owner = "client!acp", name = "ao", descriptor = "()V", line = 43)
	@Override
	public void method6590() {
		if (this.aClass21_Sub3_Sub1_2.aClass25_Sub2_2 == this.aClass25_Sub2_1) {
			return;
		}
		if (this.aClass25_Sub2_1 == null) {
			throw new RuntimeException_Sub1();
		}
		OpenGL.glUseProgram(this.anInt674);
		this.aClass21_Sub3_Sub1_2.aClass25_Sub2_2 = this.aClass25_Sub2_1;
	}

	@OriginalMember(owner = "client!acp", name = "p", descriptor = "()V", line = 43)
	@Override
	public void method6550() {
		if (this.aClass21_Sub3_Sub1_2.aClass25_Sub2_2 == this.aClass25_Sub2_1) {
			return;
		}
		if (this.aClass25_Sub2_1 == null) {
			throw new RuntimeException_Sub1();
		}
		OpenGL.glUseProgram(this.anInt674);
		this.aClass21_Sub3_Sub1_2.aClass25_Sub2_2 = this.aClass25_Sub2_1;
	}

	@OriginalMember(owner = "client!acp", name = "ap", descriptor = "()V", line = 43)
	@Override
	public void method6552() {
		if (this.aClass21_Sub3_Sub1_2.aClass25_Sub2_2 == this.aClass25_Sub2_1) {
			return;
		}
		if (this.aClass25_Sub2_1 == null) {
			throw new RuntimeException_Sub1();
		}
		OpenGL.glUseProgram(this.anInt674);
		this.aClass21_Sub3_Sub1_2.aClass25_Sub2_2 = this.aClass25_Sub2_1;
	}

	@OriginalMember(owner = "client!acp", name = "ab", descriptor = "()V", line = 49)
	@Override
	public void method6557() {
	}

	@OriginalMember(owner = "client!acp", name = "au", descriptor = "()V", line = 49)
	@Override
	public void method6593() {
	}

	@OriginalMember(owner = "client!acp", name = "ay", descriptor = "()V", line = 49)
	@Override
	public void method6594() {
	}

	@OriginalMember(owner = "client!acp", name = "ag", descriptor = "()V", line = 49)
	@Override
	public void method6595() {
	}

	@OriginalMember(owner = "client!acp", name = "a", descriptor = "()V", line = 49)
	@Override
	public void method6551() {
	}

	@OriginalMember(owner = "client!acp", name = "am", descriptor = "()V", line = 49)
	@Override
	public void method6596() {
	}

	@OriginalMember(owner = "client!acp", name = "ae", descriptor = "()Z", line = 52)
	@Override
	public boolean method6598() {
		return this.aClass21_Sub3_Sub1_2.aClass25_Sub2_2 == this.aClass25_Sub2_1;
	}

	@OriginalMember(owner = "client!acp", name = "g", descriptor = "()Z", line = 52)
	@Override
	public boolean method6574() {
		return this.aClass21_Sub3_Sub1_2.aClass25_Sub2_2 == this.aClass25_Sub2_1;
	}

	@OriginalMember(owner = "client!acp", name = "ar", descriptor = "()Z", line = 52)
	@Override
	public boolean method6597() {
		return this.aClass21_Sub3_Sub1_2.aClass25_Sub2_2 == this.aClass25_Sub2_1;
	}

	@OriginalMember(owner = "client!acp", name = "dr", descriptor = "()V", line = 56)
	@Override
	void method6580() {
		for (@Pc(1) int local1 = 0; local1 < this.method6556(); local1++) {
			((Class25_Sub2) this.method6549(local1)).method27209();
		}
		super.method6589();
	}

	@OriginalMember(owner = "client!acp", name = "al", descriptor = "()V", line = 56)
	@Override
	void method6589() {
		for (@Pc(1) int local1 = 0; local1 < this.method6556(); local1++) {
			((Class25_Sub2) this.method6549(local1)).method27209();
		}
		super.method6589();
	}

	@OriginalMember(owner = "client!acp", name = "finalize", descriptor = "()V", line = 63)
	@Override
	void finalize() throws Throwable {
		this.method6589();
		super.finalize();
	}

	@OriginalMember(owner = "client!acp", name = "hh", descriptor = "()V", line = 63)
	void method6674() throws Throwable {
		this.method6589();
		super.finalize();
	}
}
