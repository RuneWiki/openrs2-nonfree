package com.jagex;

import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wf")
public class Class549 implements Iterator {

	@OriginalMember(owner = "client!wf", name = "g", descriptor = "Lclient!ags;")
	Class3_Sub1 aClass3_Sub1_64 = null;

	@OriginalMember(owner = "client!wf", name = "p", descriptor = "Lclient!wc;")
	Class546 aClass546_18;

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "Lclient!ags;")
	Class3_Sub1 aClass3_Sub1_65;

	@OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(Lclient!wc;)V", line = 11)
	public Class549(@OriginalArg(0) Class546 arg0) {
		this.aClass546_18 = arg0;
		this.aClass3_Sub1_65 = this.aClass546_18.aClass3_Sub1_62.aClass3_Sub1_66;
		this.aClass3_Sub1_64 = null;
	}

	@OriginalMember(owner = "client!wf", name = "s", descriptor = "(I)V", line = 18)
	void method32663() {
		this.aClass3_Sub1_65 = this.aClass546_18.aClass3_Sub1_62.aClass3_Sub1_66;
		this.aClass3_Sub1_64 = null;
	}

	@OriginalMember(owner = "client!wf", name = "y", descriptor = "()Lclient!ags;", line = 23)
	public Class3_Sub1 method32667() {
		this.method32663();
		return (Class3_Sub1) this.next();
	}

	@OriginalMember(owner = "client!wf", name = "u", descriptor = "(B)Lclient!ags;", line = 23)
	public Class3_Sub1 method32671() {
		this.method32663();
		return (Class3_Sub1) this.next();
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "()Lclient!ags;", line = 23)
	public Class3_Sub1 method32672() {
		this.method32663();
		return (Class3_Sub1) this.next();
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "()Ljava/lang/Object;", line = 28)
	public Object method32664() {
		@Pc(2) Class3_Sub1 local2 = this.aClass3_Sub1_65;
		if (local2 == this.aClass546_18.aClass3_Sub1_62) {
			local2 = null;
			this.aClass3_Sub1_65 = null;
		} else {
			this.aClass3_Sub1_65 = local2.aClass3_Sub1_66;
		}
		this.aClass3_Sub1_64 = local2;
		return local2;
	}

	@OriginalMember(owner = "client!wf", name = "next", descriptor = "()Ljava/lang/Object;", line = 28)
	@Override
	public Object next() {
		@Pc(2) Class3_Sub1 local2 = this.aClass3_Sub1_65;
		if (local2 == this.aClass546_18.aClass3_Sub1_62) {
			local2 = null;
			this.aClass3_Sub1_65 = null;
		} else {
			this.aClass3_Sub1_65 = local2.aClass3_Sub1_66;
		}
		this.aClass3_Sub1_64 = local2;
		return local2;
	}

	@OriginalMember(owner = "client!wf", name = "p", descriptor = "()Ljava/lang/Object;", line = 28)
	public Object method32666() {
		@Pc(2) Class3_Sub1 local2 = this.aClass3_Sub1_65;
		if (local2 == this.aClass546_18.aClass3_Sub1_62) {
			local2 = null;
			this.aClass3_Sub1_65 = null;
		} else {
			this.aClass3_Sub1_65 = local2.aClass3_Sub1_66;
		}
		this.aClass3_Sub1_64 = local2;
		return local2;
	}

	@OriginalMember(owner = "client!wf", name = "g", descriptor = "()Ljava/lang/Object;", line = 28)
	public Object method32668() {
		@Pc(2) Class3_Sub1 local2 = this.aClass3_Sub1_65;
		if (local2 == this.aClass546_18.aClass3_Sub1_62) {
			local2 = null;
			this.aClass3_Sub1_65 = null;
		} else {
			this.aClass3_Sub1_65 = local2.aClass3_Sub1_66;
		}
		this.aClass3_Sub1_64 = local2;
		return local2;
	}

	@OriginalMember(owner = "client!wf", name = "l", descriptor = "()Ljava/lang/Object;", line = 28)
	public Object method32669() {
		@Pc(2) Class3_Sub1 local2 = this.aClass3_Sub1_65;
		if (local2 == this.aClass546_18.aClass3_Sub1_62) {
			local2 = null;
			this.aClass3_Sub1_65 = null;
		} else {
			this.aClass3_Sub1_65 = local2.aClass3_Sub1_66;
		}
		this.aClass3_Sub1_64 = local2;
		return local2;
	}

	@OriginalMember(owner = "client!wf", name = "hasNext", descriptor = "()Z", line = 39)
	@Override
	public boolean hasNext() {
		return this.aClass546_18.aClass3_Sub1_62 != this.aClass3_Sub1_65;
	}

	@OriginalMember(owner = "client!wf", name = "x", descriptor = "()Z", line = 39)
	public boolean method32665() {
		return this.aClass546_18.aClass3_Sub1_62 != this.aClass3_Sub1_65;
	}

	@OriginalMember(owner = "client!wf", name = "remove", descriptor = "()V", line = 43)
	@Override
	public void remove() {
		if (this.aClass3_Sub1_64 == null) {
			throw new IllegalStateException();
		}
		this.aClass3_Sub1_64.method33669();
		this.aClass3_Sub1_64 = null;
	}

	@OriginalMember(owner = "client!wf", name = "h", descriptor = "()V", line = 43)
	public void method32670() {
		if (this.aClass3_Sub1_64 == null) {
			throw new IllegalStateException();
		}
		this.aClass3_Sub1_64.method33669();
		this.aClass3_Sub1_64 = null;
	}

	@OriginalMember(owner = "client!wf", name = "y", descriptor = "(I)Z", line = 386)
	static boolean method32673() {
		if (Class2.aClass3_Sub1_Sub7_1 == null) {
			return false;
		} else {
			if (Class2.aClass3_Sub1_Sub7_1.anInt2664 * 296027207 >= 2000) {
				Class2.aClass3_Sub1_Sub7_1.anInt2664 -= 1219015088;
			}
			return Class2.aClass3_Sub1_Sub7_1.anInt2664 * 296027207 == 1007;
		}
	}

	@OriginalMember(owner = "client!wf", name = "aig", descriptor = "(Lclient!vs;B)V", line = 10461)
	static final void method32674(@OriginalArg(0) Class536 arg0) {
		Class339.method26424((String) arg0.anObjectArray42[(arg0.anInt5315 -= 790013775) * 996806575], false, false);
	}
}
