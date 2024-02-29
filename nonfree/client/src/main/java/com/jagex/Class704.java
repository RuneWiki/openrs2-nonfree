package com.jagex;

import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!zw")
public class Class704 implements Iterator {

	@OriginalMember(owner = "client!zw", name = "v", descriptor = "Lclient!sn;")
	Class77 aClass77_226 = null;

	@OriginalMember(owner = "client!zw", name = "p", descriptor = "Lclient!zm;")
	Class695 aClass695_56;

	@OriginalMember(owner = "client!zw", name = "c", descriptor = "Lclient!sn;")
	Class77 aClass77_225;

	@OriginalMember(owner = "client!zw", name = "<init>", descriptor = "(Lclient!zm;)V", line = 11)
	public Class704(@OriginalArg(0) Class695 arg0) {
		this.aClass695_56 = arg0;
		this.aClass77_225 = this.aClass695_56.aClass77_223.aClass77_222;
		this.aClass77_226 = null;
	}

	@OriginalMember(owner = "client!zw", name = "x", descriptor = "(Lclient!zm;I)V", line = 18)
	public void method36545(@OriginalArg(0) Class695 arg0) {
		this.aClass695_56 = arg0;
		this.aClass77_225 = this.aClass695_56.aClass77_223.aClass77_222;
		this.aClass77_226 = null;
	}

	@OriginalMember(owner = "client!zw", name = "r", descriptor = "(Lclient!zm;)V", line = 18)
	public void method36546(@OriginalArg(0) Class695 arg0) {
		this.aClass695_56 = arg0;
		this.aClass77_225 = this.aClass695_56.aClass77_223.aClass77_222;
		this.aClass77_226 = null;
	}

	@OriginalMember(owner = "client!zw", name = "g", descriptor = "(Lclient!zm;)V", line = 18)
	public void method36547(@OriginalArg(0) Class695 arg0) {
		this.aClass695_56 = arg0;
		this.aClass77_225 = this.aClass695_56.aClass77_223.aClass77_222;
		this.aClass77_226 = null;
	}

	@OriginalMember(owner = "client!zw", name = "z", descriptor = "(Lclient!zm;)V", line = 18)
	public void method36548(@OriginalArg(0) Class695 arg0) {
		this.aClass695_56 = arg0;
		this.aClass77_225 = this.aClass695_56.aClass77_223.aClass77_222;
		this.aClass77_226 = null;
	}

	@OriginalMember(owner = "client!zw", name = "j", descriptor = "()V", line = 24)
	void method36549() {
		this.aClass77_225 = this.aClass695_56.aClass77_223.aClass77_222;
		this.aClass77_226 = null;
	}

	@OriginalMember(owner = "client!zw", name = "d", descriptor = "(S)V", line = 24)
	void method36550() {
		this.aClass77_225 = this.aClass695_56.aClass77_223.aClass77_222;
		this.aClass77_226 = null;
	}

	@OriginalMember(owner = "client!zw", name = "s", descriptor = "(B)Lclient!sn;", line = 29)
	public Class77 method36551() {
		this.method36550();
		return (Class77) this.next();
	}

	@OriginalMember(owner = "client!zw", name = "i", descriptor = "()Lclient!sn;", line = 29)
	public Class77 method36552() {
		this.method36550();
		return (Class77) this.next();
	}

	@OriginalMember(owner = "client!zw", name = "y", descriptor = "()Ljava/lang/Object;", line = 34)
	public Object method36553() {
		@Pc(2) Class77 local2 = this.aClass77_225;
		if (local2 == this.aClass695_56.aClass77_223) {
			local2 = null;
			this.aClass77_225 = null;
		} else {
			this.aClass77_225 = local2.aClass77_222;
		}
		this.aClass77_226 = local2;
		return local2;
	}

	@OriginalMember(owner = "client!zw", name = "next", descriptor = "()Ljava/lang/Object;", line = 34)
	@Override
	public Object next() {
		@Pc(2) Class77 local2 = this.aClass77_225;
		if (local2 == this.aClass695_56.aClass77_223) {
			local2 = null;
			this.aClass77_225 = null;
		} else {
			this.aClass77_225 = local2.aClass77_222;
		}
		this.aClass77_226 = local2;
		return local2;
	}

	@OriginalMember(owner = "client!zw", name = "w", descriptor = "()Ljava/lang/Object;", line = 34)
	public Object method36554() {
		@Pc(2) Class77 local2 = this.aClass77_225;
		if (local2 == this.aClass695_56.aClass77_223) {
			local2 = null;
			this.aClass77_225 = null;
		} else {
			this.aClass77_225 = local2.aClass77_222;
		}
		this.aClass77_226 = local2;
		return local2;
	}

	@OriginalMember(owner = "client!zw", name = "hasNext", descriptor = "()Z", line = 45)
	@Override
	public boolean hasNext() {
		return this.aClass77_225 != this.aClass695_56.aClass77_223;
	}

	@OriginalMember(owner = "client!zw", name = "p", descriptor = "()Z", line = 45)
	public boolean method36555() {
		return this.aClass77_225 != this.aClass695_56.aClass77_223;
	}

	@OriginalMember(owner = "client!zw", name = "v", descriptor = "()Z", line = 45)
	public boolean method36556() {
		return this.aClass77_225 != this.aClass695_56.aClass77_223;
	}

	@OriginalMember(owner = "client!zw", name = "l", descriptor = "()Z", line = 45)
	public boolean method36557() {
		return this.aClass77_225 != this.aClass695_56.aClass77_223;
	}

	@OriginalMember(owner = "client!zw", name = "c", descriptor = "()Z", line = 45)
	public boolean method36558() {
		return this.aClass77_225 != this.aClass695_56.aClass77_223;
	}

	@OriginalMember(owner = "client!zw", name = "q", descriptor = "()V", line = 49)
	public void method36559() {
		if (this.aClass77_226 == null) {
			throw new IllegalStateException();
		}
		this.aClass77_226.method24063();
		this.aClass77_226 = null;
	}

	@OriginalMember(owner = "client!zw", name = "remove", descriptor = "()V", line = 49)
	@Override
	public void remove() {
		if (this.aClass77_226 == null) {
			throw new IllegalStateException();
		}
		this.aClass77_226.method24063();
		this.aClass77_226 = null;
	}

	@OriginalMember(owner = "client!zw", name = "t", descriptor = "()V", line = 49)
	public void method36560() {
		if (this.aClass77_226 == null) {
			throw new IllegalStateException();
		}
		this.aClass77_226.method24063();
		this.aClass77_226 = null;
	}

	@OriginalMember(owner = "client!zw", name = "x", descriptor = "(I)V", line = 712)
	static void method36561() {
		Class152.anInt2399 = 0;
		for (@Pc(3) int local3 = 0; local3 < 2048; local3++) {
			Class152.aClass77_Sub39Array2[local3] = null;
			Class152.aClass77_Sub39Array1[local3] = null;
			Class152.aByteArray38[local3] = Class671.aClass671_4.aByte175;
			Class152.aClass526Array1[local3] = null;
		}
	}

	@OriginalMember(owner = "client!zw", name = "ai", descriptor = "(B)V", line = 889)
	static void method36562() {
		for (@Pc(4) Class77_Sub1_Sub11 local4 = (Class77_Sub1_Sub11) Class683.aClass691_17.method36335(); local4 != null; local4 = (Class77_Sub1_Sub11) Class683.aClass691_17.method36340()) {
			if (local4.anInt3023 * -475442105 > 1) {
				local4.anInt3023 = 0;
				Class683.aClass232_93.method25844(local4, ((Class77_Sub1_Sub7) local4.aClass691_11.aClass77_Sub1_66.aClass77_Sub1_62).aLong150 * -6387465159951953483L);
				local4.aClass691_11.method36321();
			}
		}
		Class683.anInt5840 = 0;
		Class683.anInt5826 = 0;
		Class683.aClass695_55.method36380();
		Class683.aClass12_39.method188();
		Class683.aClass691_17.method36321();
		Class522.method30605(Class548.aClass77_Sub1_Sub7_6);
	}

	@OriginalMember(owner = "client!zw", name = "xv", descriptor = "(Lclient!yf;I)V", line = 8886)
	static final void method36563(@OriginalArg(0) Class665 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt5781 -= 1460193483) * 1485266147];
		@Pc(26) int local26 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		Class242.method26022(local13, local26);
	}
}
