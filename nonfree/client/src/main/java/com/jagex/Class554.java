package com.jagex;

import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wl")
public class Class554 implements Iterator {

	@OriginalMember(owner = "client!wl", name = "g", descriptor = "Lclient!ps;")
	Class3 aClass3_239 = null;

	@OriginalMember(owner = "client!wl", name = "p", descriptor = "Lclient!wk;")
	Class553 aClass553_56;

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "Lclient!ps;")
	Class3 aClass3_240;

	@OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(Lclient!wk;)V", line = 11)
	public Class554(@OriginalArg(0) Class553 arg0) {
		this.aClass553_56 = arg0;
		this.aClass3_240 = this.aClass553_56.aClass3_238.aClass3_246;
		this.aClass3_239 = null;
	}

	@OriginalMember(owner = "client!wl", name = "s", descriptor = "(Lclient!wk;I)V", line = 18)
	public void method32775(@OriginalArg(0) Class553 arg0) {
		this.aClass553_56 = arg0;
		this.aClass3_240 = this.aClass553_56.aClass3_238.aClass3_246;
		this.aClass3_239 = null;
	}

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "(Lclient!wk;)V", line = 18)
	public void method32784(@OriginalArg(0) Class553 arg0) {
		this.aClass553_56 = arg0;
		this.aClass3_240 = this.aClass553_56.aClass3_238.aClass3_246;
		this.aClass3_239 = null;
	}

	@OriginalMember(owner = "client!wl", name = "c", descriptor = "(Lclient!wk;)V", line = 18)
	public void method32785(@OriginalArg(0) Class553 arg0) {
		this.aClass553_56 = arg0;
		this.aClass3_240 = this.aClass553_56.aClass3_238.aClass3_246;
		this.aClass3_239 = null;
	}

	@OriginalMember(owner = "client!wl", name = "z", descriptor = "(Lclient!wk;)V", line = 18)
	public void method32789(@OriginalArg(0) Class553 arg0) {
		this.aClass553_56 = arg0;
		this.aClass3_240 = this.aClass553_56.aClass3_238.aClass3_246;
		this.aClass3_239 = null;
	}

	@OriginalMember(owner = "client!wl", name = "n", descriptor = "()V", line = 24)
	void method32774() {
		this.aClass3_240 = this.aClass553_56.aClass3_238.aClass3_246;
		this.aClass3_239 = null;
	}

	@OriginalMember(owner = "client!wl", name = "u", descriptor = "(I)V", line = 24)
	void method32776() {
		this.aClass3_240 = this.aClass553_56.aClass3_238.aClass3_246;
		this.aClass3_239 = null;
	}

	@OriginalMember(owner = "client!wl", name = "j", descriptor = "()V", line = 24)
	void method32780() {
		this.aClass3_240 = this.aClass553_56.aClass3_238.aClass3_246;
		this.aClass3_239 = null;
	}

	@OriginalMember(owner = "client!wl", name = "e", descriptor = "()V", line = 24)
	void method32788() {
		this.aClass3_240 = this.aClass553_56.aClass3_238.aClass3_246;
		this.aClass3_239 = null;
	}

	@OriginalMember(owner = "client!wl", name = "d", descriptor = "()Lclient!ps;", line = 29)
	public Class3 method32777() {
		this.method32776();
		return (Class3) this.next();
	}

	@OriginalMember(owner = "client!wl", name = "y", descriptor = "(I)Lclient!ps;", line = 29)
	public Class3 method32778() {
		this.method32776();
		return (Class3) this.next();
	}

	@OriginalMember(owner = "client!wl", name = "r", descriptor = "()Lclient!ps;", line = 29)
	public Class3 method32787() {
		this.method32776();
		return (Class3) this.next();
	}

	@OriginalMember(owner = "client!wl", name = "next", descriptor = "()Ljava/lang/Object;", line = 34)
	@Override
	public Object next() {
		@Pc(2) Class3 local2 = this.aClass3_240;
		if (this.aClass553_56.aClass3_238 == local2) {
			local2 = null;
			this.aClass3_240 = null;
		} else {
			this.aClass3_240 = local2.aClass3_246;
		}
		this.aClass3_239 = local2;
		return local2;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "()Ljava/lang/Object;", line = 34)
	public Object method32779() {
		@Pc(2) Class3 local2 = this.aClass3_240;
		if (this.aClass553_56.aClass3_238 == local2) {
			local2 = null;
			this.aClass3_240 = null;
		} else {
			this.aClass3_240 = local2.aClass3_246;
		}
		this.aClass3_239 = local2;
		return local2;
	}

	@OriginalMember(owner = "client!wl", name = "l", descriptor = "()Ljava/lang/Object;", line = 34)
	public Object method32781() {
		@Pc(2) Class3 local2 = this.aClass3_240;
		if (this.aClass553_56.aClass3_238 == local2) {
			local2 = null;
			this.aClass3_240 = null;
		} else {
			this.aClass3_240 = local2.aClass3_246;
		}
		this.aClass3_239 = local2;
		return local2;
	}

	@OriginalMember(owner = "client!wl", name = "p", descriptor = "()Ljava/lang/Object;", line = 34)
	public Object method32783() {
		@Pc(2) Class3 local2 = this.aClass3_240;
		if (this.aClass553_56.aClass3_238 == local2) {
			local2 = null;
			this.aClass3_240 = null;
		} else {
			this.aClass3_240 = local2.aClass3_246;
		}
		this.aClass3_239 = local2;
		return local2;
	}

	@OriginalMember(owner = "client!wl", name = "g", descriptor = "()Ljava/lang/Object;", line = 34)
	public Object method32790() {
		@Pc(2) Class3 local2 = this.aClass3_240;
		if (this.aClass553_56.aClass3_238 == local2) {
			local2 = null;
			this.aClass3_240 = null;
		} else {
			this.aClass3_240 = local2.aClass3_246;
		}
		this.aClass3_239 = local2;
		return local2;
	}

	@OriginalMember(owner = "client!wl", name = "hasNext", descriptor = "()Z", line = 45)
	@Override
	public boolean hasNext() {
		return this.aClass553_56.aClass3_238 != this.aClass3_240;
	}

	@OriginalMember(owner = "client!wl", name = "x", descriptor = "()Z", line = 45)
	public boolean method32786() {
		return this.aClass553_56.aClass3_238 != this.aClass3_240;
	}

	@OriginalMember(owner = "client!wl", name = "remove", descriptor = "()V", line = 49)
	@Override
	public void remove() {
		if (this.aClass3_239 == null) {
			throw new IllegalStateException();
		}
		this.aClass3_239.method33656();
		this.aClass3_239 = null;
	}

	@OriginalMember(owner = "client!wl", name = "h", descriptor = "()V", line = 49)
	public void method32782() {
		if (this.aClass3_239 == null) {
			throw new IllegalStateException();
		}
		this.aClass3_239.method33656();
		this.aClass3_239 = null;
	}
}
