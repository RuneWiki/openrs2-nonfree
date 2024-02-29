package com.jagex;

import jagdx.IUnknown;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public abstract class Class116 implements Interface35 {

	@OriginalMember(owner = "client!nt", name = "y", descriptor = "J")
	long aLong42 = 0L;

	@OriginalMember(owner = "client!nt", name = "p", descriptor = "Lclient!apn;")
	final Class86_Sub1_Sub1 aClass86_Sub1_Sub1_8;

	@OriginalMember(owner = "client!nt", name = "c", descriptor = "Lclient!dt;")
	final Class212 aClass212_15;

	@OriginalMember(owner = "client!nt", name = "v", descriptor = "Lclient!dl;")
	final Class206 aClass206_15;

	@OriginalMember(owner = "client!nt", name = "l", descriptor = "Z")
	boolean aBoolean220;

	@OriginalMember(owner = "client!nt", name = "<init>", descriptor = "(Lclient!apn;Lclient!dt;Lclient!dl;ZI)V", line = 16)
	Class116(@OriginalArg(0) Class86_Sub1_Sub1 arg0, @OriginalArg(1) Class212 arg1, @OriginalArg(2) Class206 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		this.aClass86_Sub1_Sub1_8 = arg0;
		this.aClass212_15 = arg1;
		this.aClass206_15 = arg2;
		this.aBoolean220 = arg3;
		this.aClass86_Sub1_Sub1_8.method20382(this);
	}

	@OriginalMember(owner = "client!nt", name = "ba", descriptor = "()J", line = 25)
	long method10852() {
		return this.aLong42;
	}

	@OriginalMember(owner = "client!nt", name = "bb", descriptor = "()J", line = 25)
	long method10853() {
		return this.aLong42;
	}

	@OriginalMember(owner = "client!nt", name = "aw", descriptor = "(Lclient!lo;)V", line = 29)
	public void method10854(@OriginalArg(0) Class382 arg0) {
	}

	@OriginalMember(owner = "client!nt", name = "az", descriptor = "(Lclient!lo;)V", line = 29)
	public void method10855(@OriginalArg(0) Class382 arg0) {
	}

	@OriginalMember(owner = "client!nt", name = "af", descriptor = "(Lclient!lo;)V", line = 29)
	public void method10856(@OriginalArg(0) Class382 arg0) {
	}

	@OriginalMember(owner = "client!nt", name = "v", descriptor = "()V", line = 32)
	@Override
	public void method30322() {
		if (this.aLong42 != 0L) {
			IUnknown.Release(this.aLong42);
			this.aLong42 = 0L;
		}
		this.aClass86_Sub1_Sub1_8.method20385(this);
	}

	@OriginalMember(owner = "client!nt", name = "s", descriptor = "()V", line = 32)
	@Override
	public void method30320() {
		if (this.aLong42 != 0L) {
			IUnknown.Release(this.aLong42);
			this.aLong42 = 0L;
		}
		this.aClass86_Sub1_Sub1_8.method20385(this);
	}

	@OriginalMember(owner = "client!nt", name = "r", descriptor = "()V", line = 32)
	@Override
	public void method30321() {
		if (this.aLong42 != 0L) {
			IUnknown.Release(this.aLong42);
			this.aLong42 = 0L;
		}
		this.aClass86_Sub1_Sub1_8.method20385(this);
	}

	@OriginalMember(owner = "client!nt", name = "g", descriptor = "()V", line = 32)
	@Override
	public void method30319() {
		if (this.aLong42 != 0L) {
			IUnknown.Release(this.aLong42);
			this.aLong42 = 0L;
		}
		this.aClass86_Sub1_Sub1_8.method20385(this);
	}

	@OriginalMember(owner = "client!nt", name = "by", descriptor = "()V", line = 40)
	void method10857() {
		if (this.aLong42 != 0L) {
			this.aClass86_Sub1_Sub1_8.method19590(this.aLong42);
			this.aLong42 = 0L;
		}
	}

	@OriginalMember(owner = "client!nt", name = "bd", descriptor = "()V", line = 40)
	void method10858() {
		if (this.aLong42 != 0L) {
			this.aClass86_Sub1_Sub1_8.method19590(this.aLong42);
			this.aLong42 = 0L;
		}
	}

	@OriginalMember(owner = "client!nt", name = "bl", descriptor = "()V", line = 40)
	void method10859() {
		if (this.aLong42 != 0L) {
			this.aClass86_Sub1_Sub1_8.method19590(this.aLong42);
			this.aLong42 = 0L;
		}
	}

	@OriginalMember(owner = "client!nt", name = "bx", descriptor = "()V", line = 40)
	void method10860() {
		if (this.aLong42 != 0L) {
			this.aClass86_Sub1_Sub1_8.method19590(this.aLong42);
			this.aLong42 = 0L;
		}
	}

	@OriginalMember(owner = "client!nt", name = "finalize", descriptor = "()V", line = 47)
	@Override
	void finalize() {
		this.method10859();
	}

	@OriginalMember(owner = "client!nt", name = "hc", descriptor = "()V", line = 47)
	void method10861() {
		this.method10859();
	}

	@OriginalMember(owner = "client!nt", name = "hd", descriptor = "()V", line = 47)
	void method10862() {
		this.method10859();
	}

	@OriginalMember(owner = "client!nt", name = "hp", descriptor = "()V", line = 47)
	void method10863() {
		this.method10859();
	}
}
