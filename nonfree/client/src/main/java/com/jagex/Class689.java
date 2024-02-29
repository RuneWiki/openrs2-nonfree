package com.jagex;

import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!zg")
public class Class689 implements Iterator {

	@OriginalMember(owner = "client!zg", name = "v", descriptor = "Lclient!ajq;")
	Class77_Sub1 aClass77_Sub1_65 = null;

	@OriginalMember(owner = "client!zg", name = "p", descriptor = "Lclient!zi;")
	Class691 aClass691_18;

	@OriginalMember(owner = "client!zg", name = "c", descriptor = "Lclient!ajq;")
	Class77_Sub1 aClass77_Sub1_64;

	@OriginalMember(owner = "client!zg", name = "<init>", descriptor = "(Lclient!zi;)V", line = 11)
	public Class689(@OriginalArg(0) Class691 arg0) {
		this.aClass691_18 = arg0;
		this.aClass77_Sub1_64 = this.aClass691_18.aClass77_Sub1_66.aClass77_Sub1_62;
		this.aClass77_Sub1_65 = null;
	}

	@OriginalMember(owner = "client!zg", name = "x", descriptor = "(B)V", line = 18)
	void method36299() {
		this.aClass77_Sub1_64 = this.aClass691_18.aClass77_Sub1_66.aClass77_Sub1_62;
		this.aClass77_Sub1_65 = null;
	}

	@OriginalMember(owner = "client!zg", name = "z", descriptor = "()Lclient!ajq;", line = 23)
	public Class77_Sub1 method36300() {
		this.method36299();
		return (Class77_Sub1) this.next();
	}

	@OriginalMember(owner = "client!zg", name = "s", descriptor = "()Lclient!ajq;", line = 23)
	public Class77_Sub1 method36301() {
		this.method36299();
		return (Class77_Sub1) this.next();
	}

	@OriginalMember(owner = "client!zg", name = "r", descriptor = "()Lclient!ajq;", line = 23)
	public Class77_Sub1 method36302() {
		this.method36299();
		return (Class77_Sub1) this.next();
	}

	@OriginalMember(owner = "client!zg", name = "g", descriptor = "()Lclient!ajq;", line = 23)
	public Class77_Sub1 method36303() {
		this.method36299();
		return (Class77_Sub1) this.next();
	}

	@OriginalMember(owner = "client!zg", name = "d", descriptor = "(B)Lclient!ajq;", line = 23)
	public Class77_Sub1 method36304() {
		this.method36299();
		return (Class77_Sub1) this.next();
	}

	@OriginalMember(owner = "client!zg", name = "next", descriptor = "()Ljava/lang/Object;", line = 28)
	@Override
	public Object next() {
		@Pc(2) Class77_Sub1 local2 = this.aClass77_Sub1_64;
		if (local2 == this.aClass691_18.aClass77_Sub1_66) {
			local2 = null;
			this.aClass77_Sub1_64 = null;
		} else {
			this.aClass77_Sub1_64 = local2.aClass77_Sub1_62;
		}
		this.aClass77_Sub1_65 = local2;
		return local2;
	}

	@OriginalMember(owner = "client!zg", name = "y", descriptor = "()Ljava/lang/Object;", line = 28)
	public Object method36305() {
		@Pc(2) Class77_Sub1 local2 = this.aClass77_Sub1_64;
		if (local2 == this.aClass691_18.aClass77_Sub1_66) {
			local2 = null;
			this.aClass77_Sub1_64 = null;
		} else {
			this.aClass77_Sub1_64 = local2.aClass77_Sub1_62;
		}
		this.aClass77_Sub1_65 = local2;
		return local2;
	}

	@OriginalMember(owner = "client!zg", name = "w", descriptor = "()Ljava/lang/Object;", line = 28)
	public Object method36306() {
		@Pc(2) Class77_Sub1 local2 = this.aClass77_Sub1_64;
		if (local2 == this.aClass691_18.aClass77_Sub1_66) {
			local2 = null;
			this.aClass77_Sub1_64 = null;
		} else {
			this.aClass77_Sub1_64 = local2.aClass77_Sub1_62;
		}
		this.aClass77_Sub1_65 = local2;
		return local2;
	}

	@OriginalMember(owner = "client!zg", name = "hasNext", descriptor = "()Z", line = 39)
	@Override
	public boolean hasNext() {
		return this.aClass77_Sub1_64 != this.aClass691_18.aClass77_Sub1_66;
	}

	@OriginalMember(owner = "client!zg", name = "v", descriptor = "()Z", line = 39)
	public boolean method36307() {
		return this.aClass77_Sub1_64 != this.aClass691_18.aClass77_Sub1_66;
	}

	@OriginalMember(owner = "client!zg", name = "c", descriptor = "()Z", line = 39)
	public boolean method36308() {
		return this.aClass77_Sub1_64 != this.aClass691_18.aClass77_Sub1_66;
	}

	@OriginalMember(owner = "client!zg", name = "p", descriptor = "()Z", line = 39)
	public boolean method36309() {
		return this.aClass77_Sub1_64 != this.aClass691_18.aClass77_Sub1_66;
	}

	@OriginalMember(owner = "client!zg", name = "l", descriptor = "()Z", line = 39)
	public boolean method36310() {
		return this.aClass77_Sub1_64 != this.aClass691_18.aClass77_Sub1_66;
	}

	@OriginalMember(owner = "client!zg", name = "t", descriptor = "()V", line = 43)
	public void method36311() {
		if (this.aClass77_Sub1_65 == null) {
			throw new IllegalStateException();
		}
		this.aClass77_Sub1_65.method24069();
		this.aClass77_Sub1_65 = null;
	}

	@OriginalMember(owner = "client!zg", name = "remove", descriptor = "()V", line = 43)
	@Override
	public void remove() {
		if (this.aClass77_Sub1_65 == null) {
			throw new IllegalStateException();
		}
		this.aClass77_Sub1_65.method24069();
		this.aClass77_Sub1_65 = null;
	}

	@OriginalMember(owner = "client!zg", name = "q", descriptor = "()V", line = 43)
	public void method36312() {
		if (this.aClass77_Sub1_65 == null) {
			throw new IllegalStateException();
		}
		this.aClass77_Sub1_65.method24069();
		this.aClass77_Sub1_65 = null;
	}

	@OriginalMember(owner = "client!zg", name = "w", descriptor = "(Lclient!apo;I)V", line = 254)
	public static void method36313(@OriginalArg(0) Class104_Sub1_Sub1_Sub1_Sub1 arg0) {
		for (@Pc(4) Class77_Sub16 local4 = (Class77_Sub16) Class77_Sub16.aClass695_21.method36395(); local4 != null; local4 = (Class77_Sub16) Class77_Sub16.aClass695_21.method36406()) {
			if (local4.aClass104_Sub1_Sub1_Sub1_Sub1_1 == arg0) {
				if (local4.aClass496_3 != null) {
					local4.aClass496_3.method30100(100);
					Class94_Sub4.aClass261_1.method26325(local4.aClass496_3);
					local4.aClass496_3 = null;
				}
				local4.method24063();
				return;
			}
		}
	}
}
