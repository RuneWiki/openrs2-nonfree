package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pa")
public abstract class Class129 {

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "I")
	static final int anInt1336 = 500;

	@OriginalMember(owner = "client!pa", name = "v", descriptor = "I")
	static final int anInt1337 = 500;

	@OriginalMember(owner = "client!pa", name = "l", descriptor = "I")
	static final int anInt1338 = 102400;

	@OriginalMember(owner = "client!pa", name = "y", descriptor = "I")
	static final int anInt1339 = 5;

	@OriginalMember(owner = "client!pa", name = "w", descriptor = "I")
	static final int anInt1340 = 5;

	@OriginalMember(owner = "client!pa", name = "p", descriptor = "I")
	static final int anInt1341 = 4;

	@OriginalMember(owner = "client!pa", name = "s", descriptor = "I")
	int anInt1343;

	@OriginalMember(owner = "client!pa", name = "r", descriptor = "J")
	long aLong49;

	@OriginalMember(owner = "client!pa", name = "t", descriptor = "Lclient!zi;")
	Class691 aClass691_6 = new Class691();

	@OriginalMember(owner = "client!pa", name = "q", descriptor = "Lclient!zi;")
	Class691 aClass691_5 = new Class691();

	@OriginalMember(owner = "client!pa", name = "x", descriptor = "Lclient!zi;")
	Class691 aClass691_7 = new Class691();

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "Lclient!zi;")
	Class691 aClass691_8 = new Class691();

	@OriginalMember(owner = "client!pa", name = "g", descriptor = "Lclient!akv;")
	Class77_Sub39 aClass77_Sub39_7 = new Class77_Sub39(6);

	@OriginalMember(owner = "client!pa", name = "z", descriptor = "B")
	byte aByte45 = 0;

	@OriginalMember(owner = "client!pa", name = "j", descriptor = "I")
	public volatile int anInt1344 = 0;

	@OriginalMember(owner = "client!pa", name = "i", descriptor = "I")
	public volatile int anInt1345 = 0;

	@OriginalMember(owner = "client!pa", name = "k", descriptor = "I")
	public volatile int anInt1346 = -624355545;

	@OriginalMember(owner = "client!pa", name = "u", descriptor = "I")
	public volatile int anInt1342 = 1826868259;

	@OriginalMember(owner = "client!pa", name = "e", descriptor = "Lclient!akv;")
	Class77_Sub39 aClass77_Sub39_5 = new Class77_Sub39(5);

	@OriginalMember(owner = "client!pa", name = "f", descriptor = "Lclient!akv;")
	Class77_Sub39 aClass77_Sub39_6 = new Class77_Sub39(5);

	@OriginalMember(owner = "client!pa", name = "o", descriptor = "I")
	int anInt1347 = 0;

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "Lclient!ati;")
	Class77_Sub1_Sub18_Sub2 aClass77_Sub1_Sub18_Sub2_2 = null;

	@OriginalMember(owner = "client!pa", name = "<init>", descriptor = "()V", line = 30)
	Class129() {
	}

	@OriginalMember(owner = "client!pa", name = "p", descriptor = "(IIBZI)Lclient!ati;", line = 33)
	Class77_Sub1_Sub18_Sub2 method12177(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) long local7 = (long) arg1 + ((long) arg0 << 32);
		@Pc(11) Class77_Sub1_Sub18_Sub2 local11 = new Class77_Sub1_Sub18_Sub2();
		local11.aLong230 = local7 * 84410810002887935L;
		local11.aByte93 = arg2;
		local11.aBoolean538 = arg3;
		if (arg3) {
			if (this.method12190() >= 500) {
				throw new RuntimeException();
			}
			this.aClass691_6.method36326(local11);
		} else if (this.method12188() < 500) {
			this.aClass691_7.method36326(local11);
		} else {
			throw new RuntimeException();
		}
		return local11;
	}

	@OriginalMember(owner = "client!pa", name = "g", descriptor = "(IIBZ)Lclient!ati;", line = 33)
	Class77_Sub1_Sub18_Sub2 method12178(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3) {
		@Pc(7) long local7 = (long) arg1 + ((long) arg0 << 32);
		@Pc(11) Class77_Sub1_Sub18_Sub2 local11 = new Class77_Sub1_Sub18_Sub2();
		local11.aLong230 = local7 * 84410810002887935L;
		local11.aByte93 = arg2;
		local11.aBoolean538 = arg3;
		if (arg3) {
			if (this.method12190() >= 500) {
				throw new RuntimeException();
			}
			this.aClass691_6.method36326(local11);
		} else if (this.method12188() < 500) {
			this.aClass691_7.method36326(local11);
		} else {
			throw new RuntimeException();
		}
		return local11;
	}

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "(B)Z", line = 54)
	public boolean method12179() {
		return this.method12188() >= 500;
	}

	@OriginalMember(owner = "client!pa", name = "j", descriptor = "()Z", line = 54)
	public boolean method12180() {
		return this.method12188() >= 500;
	}

	@OriginalMember(owner = "client!pa", name = "i", descriptor = "()Z", line = 54)
	public boolean method12181() {
		return this.method12188() >= 500;
	}

	@OriginalMember(owner = "client!pa", name = "z", descriptor = "()Z", line = 54)
	public boolean method12182() {
		return this.method12188() >= 500;
	}

	@OriginalMember(owner = "client!pa", name = "t", descriptor = "(III)Lclient!arj;", line = 54)
	public static Class77_Sub1_Sub14 method12183(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(5) Class300 local5 = (Class300) Class304.aMap17.get(arg0);
		return local5.method27106(arg1);
	}

	@OriginalMember(owner = "client!pa", name = "v", descriptor = "(I)Z", line = 58)
	public boolean method12184() {
		return this.method12190() >= 500;
	}

	@OriginalMember(owner = "client!pa", name = "k", descriptor = "()Z", line = 58)
	public boolean method12185() {
		return this.method12190() >= 500;
	}

	@OriginalMember(owner = "client!pa", name = "u", descriptor = "()Z", line = 58)
	public boolean method12186() {
		return this.method12190() >= 500;
	}

	@OriginalMember(owner = "client!pa", name = "f", descriptor = "()I", line = 62)
	int method12187() {
		return this.aClass691_7.method36344() + this.aClass691_8.method36344();
	}

	@OriginalMember(owner = "client!pa", name = "l", descriptor = "(I)I", line = 62)
	int method12188() {
		return this.aClass691_7.method36344() + this.aClass691_8.method36344();
	}

	@OriginalMember(owner = "client!pa", name = "e", descriptor = "()I", line = 62)
	int method12189() {
		return this.aClass691_7.method36344() + this.aClass691_8.method36344();
	}

	@OriginalMember(owner = "client!pa", name = "y", descriptor = "(I)I", line = 66)
	public int method12190() {
		return this.aClass691_6.method36344() + this.aClass691_5.method36344();
	}

	@OriginalMember(owner = "client!pa", name = "o", descriptor = "()I", line = 66)
	public int method12191() {
		return this.aClass691_6.method36344() + this.aClass691_5.method36344();
	}

	@OriginalMember(owner = "client!pa", name = "avu", descriptor = "(Lclient!yf;I)V", line = 13172)
	static final void method12192(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub3_1.method14960() ? 1 : 0;
	}

	@OriginalMember(owner = "client!pa", name = "ak", descriptor = "()V")
	public abstract void method12193();

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(II)V")
	abstract void method12194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!pa", name = "q", descriptor = "(Ljava/lang/Object;ZB)V")
	public abstract void method12195(@OriginalArg(0) Object arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!pa", name = "t", descriptor = "(I)Z")
	public abstract boolean method12196();

	@OriginalMember(owner = "client!pa", name = "x", descriptor = "(ZI)V")
	public abstract void method12197(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!pa", name = "s", descriptor = "(I)V")
	public abstract void method12198();

	@OriginalMember(owner = "client!pa", name = "r", descriptor = "(B)V")
	public abstract void method12199();

	@OriginalMember(owner = "client!pa", name = "n", descriptor = "()Z")
	public abstract boolean method12200();

	@OriginalMember(owner = "client!pa", name = "ax", descriptor = "()V")
	public abstract void method12201();

	@OriginalMember(owner = "client!pa", name = "aj", descriptor = "(Z)V")
	public abstract void method12202(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!pa", name = "w", descriptor = "(IIB)V")
	abstract void method12203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!pa", name = "m", descriptor = "(Ljava/lang/Object;Z)V")
	public abstract void method12204(@OriginalArg(0) Object arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!pa", name = "h", descriptor = "(Ljava/lang/Object;Z)V")
	public abstract void method12205(@OriginalArg(0) Object arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "(I)V")
	public abstract void method12206();

	@OriginalMember(owner = "client!pa", name = "ai", descriptor = "()V")
	public abstract void method12207();

	@OriginalMember(owner = "client!pa", name = "ag", descriptor = "()V")
	public abstract void method12208();

	@OriginalMember(owner = "client!pa", name = "al", descriptor = "()V")
	public abstract void method12209();

	@OriginalMember(owner = "client!pa", name = "ao", descriptor = "()V")
	public abstract void method12210();

	@OriginalMember(owner = "client!pa", name = "ar", descriptor = "()V")
	public abstract void method12211();

	@OriginalMember(owner = "client!pa", name = "au", descriptor = "()V")
	public abstract void method12212();

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(Ljava/lang/Object;Z)V")
	public abstract void method12213(@OriginalArg(0) Object arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!pa", name = "ad", descriptor = "()V")
	public abstract void method12214();

	@OriginalMember(owner = "client!pa", name = "ac", descriptor = "()V")
	public abstract void method12215();

	@OriginalMember(owner = "client!pa", name = "av", descriptor = "()V")
	public abstract void method12216();
}
