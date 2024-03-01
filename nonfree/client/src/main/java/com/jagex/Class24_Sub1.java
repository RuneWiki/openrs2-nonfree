package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!acd")
public final class Class24_Sub1 extends Class24 {

	@OriginalMember(owner = "client!acd", name = "b", descriptor = "Lclient!aci;")
	Class25_Sub1 aClass25_Sub1_1;

	@OriginalMember(owner = "client!acd", name = "y", descriptor = "Lclient!akw;")
	final Class21_Sub3_Sub2 aClass21_Sub3_Sub2_1;

	@OriginalMember(owner = "client!acd", name = "c", descriptor = "Z")
	boolean aBoolean143;

	@OriginalMember(owner = "client!acd", name = "<init>", descriptor = "(Lclient!akw;Lclient!fi;)V", line = 14)
	Class24_Sub1(@OriginalArg(0) Class21_Sub3_Sub2 arg0, @OriginalArg(1) Class173 arg1) {
		super(arg0, arg1);
		this.aClass21_Sub3_Sub2_1 = arg0;
		this.aBoolean143 = false;
	}

	@OriginalMember(owner = "client!acd", name = "aw", descriptor = "(Lclient!abv;Lclient!ff;)Lclient!fk;", line = 20)
	@Override
	Class25 method6600(@OriginalArg(0) Class21_Sub3 arg0, @OriginalArg(1) Class170 arg1) {
		return new Class25_Sub1((Class21_Sub3_Sub2) arg0, this, arg1);
	}

	@OriginalMember(owner = "client!acd", name = "h", descriptor = "(Lclient!abv;Lclient!ff;)Lclient!fk;", line = 20)
	@Override
	Class25 method6582(@OriginalArg(0) Class21_Sub3 arg0, @OriginalArg(1) Class170 arg1) {
		return new Class25_Sub1((Class21_Sub3_Sub2) arg0, this, arg1);
	}

	@OriginalMember(owner = "client!acd", name = "c", descriptor = "(Lclient!fk;)Z", line = 24)
	@Override
	public boolean method6560(@OriginalArg(0) Class25 arg0) {
		if (this.aClass25_Sub1_1 == arg0) {
			return true;
		} else if (arg0.method6418()) {
			this.aClass25_Sub1_1 = (Class25_Sub1) arg0;
			this.anInt673 = this.method6592(arg0) * 1845711215;
			if (this.anInt673 * 1375415695 == -1) {
				throw new IllegalArgumentException();
			}
			if (this.aBoolean143) {
				this.aClass21_Sub3_Sub2_1.method17838(this.aClass25_Sub1_1.aLong16);
				this.aClass21_Sub3_Sub2_1.method17824(this.aClass25_Sub1_1.aLong15);
				this.aClass21_Sub3_Sub2_1.aClass25_Sub1_2 = this.aClass25_Sub1_1;
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!acd", name = "dc", descriptor = "(Lclient!fk;)Z", line = 24)
	@Override
	public boolean method6664(@OriginalArg(0) Class25 arg0) {
		if (this.aClass25_Sub1_1 == arg0) {
			return true;
		} else if (arg0.method6418()) {
			this.aClass25_Sub1_1 = (Class25_Sub1) arg0;
			this.anInt673 = this.method6592(arg0) * 1845711215;
			if (this.anInt673 * 1375415695 == -1) {
				throw new IllegalArgumentException();
			}
			if (this.aBoolean143) {
				this.aClass21_Sub3_Sub2_1.method17838(this.aClass25_Sub1_1.aLong16);
				this.aClass21_Sub3_Sub2_1.method17824(this.aClass25_Sub1_1.aLong15);
				this.aClass21_Sub3_Sub2_1.aClass25_Sub1_2 = this.aClass25_Sub1_1;
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!acd", name = "n", descriptor = "(Lclient!fr;)Lclient!alr;", line = 38)
	@Override
	Class3_Sub19_Sub1 method6563(@OriginalArg(0) Class181 arg0) {
		return new Class3_Sub19_Sub1_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!acd", name = "by", descriptor = "(Lclient!fr;)Lclient!alr;", line = 38)
	@Override
	Class3_Sub19_Sub1 method6613(@OriginalArg(0) Class181 arg0) {
		return new Class3_Sub19_Sub1_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!acd", name = "bl", descriptor = "(Lclient!fr;)Lclient!alr;", line = 38)
	@Override
	Class3_Sub19_Sub1 method6614(@OriginalArg(0) Class181 arg0) {
		return new Class3_Sub19_Sub1_Sub1(this, arg0);
	}

	@OriginalMember(owner = "client!acd", name = "ao", descriptor = "()V", line = 42)
	@Override
	public void method6590() {
		if (this.aClass25_Sub1_1 == null) {
			throw new RuntimeException_Sub1();
		}
		this.aClass21_Sub3_Sub2_1.method17838(this.aClass25_Sub1_1.aLong16);
		this.aClass21_Sub3_Sub2_1.method17824(this.aClass25_Sub1_1.aLong15);
		this.aClass21_Sub3_Sub2_1.aClass25_Sub1_2 = this.aClass25_Sub1_1;
		this.aBoolean143 = true;
	}

	@OriginalMember(owner = "client!acd", name = "ap", descriptor = "()V", line = 42)
	@Override
	public void method6552() {
		if (this.aClass25_Sub1_1 == null) {
			throw new RuntimeException_Sub1();
		}
		this.aClass21_Sub3_Sub2_1.method17838(this.aClass25_Sub1_1.aLong16);
		this.aClass21_Sub3_Sub2_1.method17824(this.aClass25_Sub1_1.aLong15);
		this.aClass21_Sub3_Sub2_1.aClass25_Sub1_2 = this.aClass25_Sub1_1;
		this.aBoolean143 = true;
	}

	@OriginalMember(owner = "client!acd", name = "p", descriptor = "()V", line = 42)
	@Override
	public void method6550() {
		if (this.aClass25_Sub1_1 == null) {
			throw new RuntimeException_Sub1();
		}
		this.aClass21_Sub3_Sub2_1.method17838(this.aClass25_Sub1_1.aLong16);
		this.aClass21_Sub3_Sub2_1.method17824(this.aClass25_Sub1_1.aLong15);
		this.aClass21_Sub3_Sub2_1.aClass25_Sub1_2 = this.aClass25_Sub1_1;
		this.aBoolean143 = true;
	}

	@OriginalMember(owner = "client!acd", name = "a", descriptor = "()V", line = 50)
	@Override
	public void method6551() {
		this.aClass21_Sub3_Sub2_1.method17838(0L);
		this.aClass21_Sub3_Sub2_1.method17824(0L);
		this.aBoolean143 = false;
		this.aClass21_Sub3_Sub2_1.aClass25_Sub1_2 = null;
		this.aClass21_Sub3_Sub2_1.method17512(1);
		this.aClass21_Sub3_Sub2_1.method17513(null);
		this.aClass21_Sub3_Sub2_1.method17512(0);
		this.aClass21_Sub3_Sub2_1.method17513(null);
	}

	@OriginalMember(owner = "client!acd", name = "ag", descriptor = "()V", line = 50)
	@Override
	public void method6595() {
		this.aClass21_Sub3_Sub2_1.method17838(0L);
		this.aClass21_Sub3_Sub2_1.method17824(0L);
		this.aBoolean143 = false;
		this.aClass21_Sub3_Sub2_1.aClass25_Sub1_2 = null;
		this.aClass21_Sub3_Sub2_1.method17512(1);
		this.aClass21_Sub3_Sub2_1.method17513(null);
		this.aClass21_Sub3_Sub2_1.method17512(0);
		this.aClass21_Sub3_Sub2_1.method17513(null);
	}

	@OriginalMember(owner = "client!acd", name = "ab", descriptor = "()V", line = 50)
	@Override
	public void method6557() {
		this.aClass21_Sub3_Sub2_1.method17838(0L);
		this.aClass21_Sub3_Sub2_1.method17824(0L);
		this.aBoolean143 = false;
		this.aClass21_Sub3_Sub2_1.aClass25_Sub1_2 = null;
		this.aClass21_Sub3_Sub2_1.method17512(1);
		this.aClass21_Sub3_Sub2_1.method17513(null);
		this.aClass21_Sub3_Sub2_1.method17512(0);
		this.aClass21_Sub3_Sub2_1.method17513(null);
	}

	@OriginalMember(owner = "client!acd", name = "au", descriptor = "()V", line = 50)
	@Override
	public void method6593() {
		this.aClass21_Sub3_Sub2_1.method17838(0L);
		this.aClass21_Sub3_Sub2_1.method17824(0L);
		this.aBoolean143 = false;
		this.aClass21_Sub3_Sub2_1.aClass25_Sub1_2 = null;
		this.aClass21_Sub3_Sub2_1.method17512(1);
		this.aClass21_Sub3_Sub2_1.method17513(null);
		this.aClass21_Sub3_Sub2_1.method17512(0);
		this.aClass21_Sub3_Sub2_1.method17513(null);
	}

	@OriginalMember(owner = "client!acd", name = "ay", descriptor = "()V", line = 50)
	@Override
	public void method6594() {
		this.aClass21_Sub3_Sub2_1.method17838(0L);
		this.aClass21_Sub3_Sub2_1.method17824(0L);
		this.aBoolean143 = false;
		this.aClass21_Sub3_Sub2_1.aClass25_Sub1_2 = null;
		this.aClass21_Sub3_Sub2_1.method17512(1);
		this.aClass21_Sub3_Sub2_1.method17513(null);
		this.aClass21_Sub3_Sub2_1.method17512(0);
		this.aClass21_Sub3_Sub2_1.method17513(null);
	}

	@OriginalMember(owner = "client!acd", name = "am", descriptor = "()V", line = 50)
	@Override
	public void method6596() {
		this.aClass21_Sub3_Sub2_1.method17838(0L);
		this.aClass21_Sub3_Sub2_1.method17824(0L);
		this.aBoolean143 = false;
		this.aClass21_Sub3_Sub2_1.aClass25_Sub1_2 = null;
		this.aClass21_Sub3_Sub2_1.method17512(1);
		this.aClass21_Sub3_Sub2_1.method17513(null);
		this.aClass21_Sub3_Sub2_1.method17512(0);
		this.aClass21_Sub3_Sub2_1.method17513(null);
	}

	@OriginalMember(owner = "client!acd", name = "g", descriptor = "()Z", line = 61)
	@Override
	public boolean method6574() {
		return this.aClass21_Sub3_Sub2_1.aClass25_Sub1_2 == this.aClass25_Sub1_1;
	}

	@OriginalMember(owner = "client!acd", name = "ar", descriptor = "()Z", line = 61)
	@Override
	public boolean method6597() {
		return this.aClass21_Sub3_Sub2_1.aClass25_Sub1_2 == this.aClass25_Sub1_1;
	}

	@OriginalMember(owner = "client!acd", name = "ae", descriptor = "()Z", line = 61)
	@Override
	public boolean method6598() {
		return this.aClass21_Sub3_Sub2_1.aClass25_Sub1_2 == this.aClass25_Sub1_1;
	}
}
