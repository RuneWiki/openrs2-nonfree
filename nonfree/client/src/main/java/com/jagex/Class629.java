package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!zs")
public class Class629 {

	@OriginalMember(owner = "client!zs", name = "g", descriptor = "I")
	public static final int anInt5583 = 64;

	@OriginalMember(owner = "client!zs", name = "l", descriptor = "I")
	public static final int anInt5584 = 64;

	@OriginalMember(owner = "client!zs", name = "gg", descriptor = "Lclient!sj;")
	public static Class457 aClass457_11;

	@OriginalMember(owner = "client!zs", name = "h", descriptor = "Lclient!ew;")
	Class161 aClass161_75 = new Class161(64);

	@OriginalMember(owner = "client!zs", name = "x", descriptor = "Lclient!ew;")
	Class161 aClass161_76 = new Class161(64);

	@OriginalMember(owner = "client!zs", name = "p", descriptor = "Lclient!ny;")
	final Class359 aClass359_120;

	@OriginalMember(owner = "client!zs", name = "a", descriptor = "Lclient!ny;")
	final Class359 aClass359_119;

	@OriginalMember(owner = "client!zs", name = "<init>", descriptor = "(Lclient!vz;Lclient!vk;Lclient!ny;Lclient!ny;)V", line = 19)
	public Class629(@OriginalArg(0) Class543 arg0, @OriginalArg(1) Class530 arg1, @OriginalArg(2) Class359 arg2, @OriginalArg(3) Class359 arg3) {
		this.aClass359_120 = arg2;
		this.aClass359_119 = arg3;
		this.aClass359_120.method26682(Class185.aClass185_68.anInt3631 * -1739932335);
		Math.random();
		Math.random();
		Math.random();
		Math.random();
	}

	@OriginalMember(owner = "client!zs", name = "p", descriptor = "(II)Lclient!zr;", line = 31)
	public Class628 method33834(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_75;
		@Pc(11) Class628 local11;
		synchronized (this.aClass161_75) {
			local11 = (Class628) this.aClass161_75.method23219((long) arg0);
		}
		if (local11 != null) {
			return local11;
		}
		@Pc(28) Class359 local28 = this.aClass359_120;
		@Pc(39) byte[] local39;
		synchronized (this.aClass359_120) {
			local39 = this.aClass359_120.method26713(Class185.aClass185_68.anInt3631 * -1739932335, arg0);
		}
		local11 = new Class628();
		local11.aClass629_4 = this;
		if (local39 != null) {
			local11.method33810(new Class3_Sub41(local39));
		}
		@Pc(68) Class161 local68 = this.aClass161_75;
		synchronized (this.aClass161_75) {
			this.aClass161_75.method23222(local11, (long) arg0);
			return local11;
		}
	}

	@OriginalMember(owner = "client!zs", name = "s", descriptor = "(II)V", line = 49)
	public void method33835(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass161_75 = new Class161(arg0);
		this.aClass161_76 = new Class161(arg1);
	}

	@OriginalMember(owner = "client!zs", name = "a", descriptor = "(III)V", line = 49)
	public void method33839(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass161_75 = new Class161(arg0);
		this.aClass161_76 = new Class161(arg1);
	}

	@OriginalMember(owner = "client!zs", name = "u", descriptor = "(II)V", line = 49)
	public void method33841(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass161_75 = new Class161(arg0);
		this.aClass161_76 = new Class161(arg1);
	}

	@OriginalMember(owner = "client!zs", name = "y", descriptor = "(II)V", line = 49)
	public void method33842(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass161_75 = new Class161(arg0);
		this.aClass161_76 = new Class161(arg1);
	}

	@OriginalMember(owner = "client!zs", name = "x", descriptor = "(II)V", line = 49)
	public void method33845(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.aClass161_75 = new Class161(arg0);
		this.aClass161_76 = new Class161(arg1);
	}

	@OriginalMember(owner = "client!zs", name = "g", descriptor = "(I)V", line = 54)
	public void method33836() {
		@Pc(3) Class161 local3 = this.aClass161_75;
		synchronized (this.aClass161_75) {
			this.aClass161_75.method23224();
		}
		local3 = this.aClass161_76;
		synchronized (this.aClass161_76) {
			this.aClass161_76.method23224();
		}
	}

	@OriginalMember(owner = "client!zs", name = "b", descriptor = "()V", line = 54)
	public void method33843() {
		@Pc(3) Class161 local3 = this.aClass161_75;
		synchronized (this.aClass161_75) {
			this.aClass161_75.method23224();
		}
		local3 = this.aClass161_76;
		synchronized (this.aClass161_76) {
			this.aClass161_76.method23224();
		}
	}

	@OriginalMember(owner = "client!zs", name = "c", descriptor = "()V", line = 54)
	public void method33844() {
		@Pc(3) Class161 local3 = this.aClass161_75;
		synchronized (this.aClass161_75) {
			this.aClass161_75.method23224();
		}
		local3 = this.aClass161_76;
		synchronized (this.aClass161_76) {
			this.aClass161_76.method23224();
		}
	}

	@OriginalMember(owner = "client!zs", name = "z", descriptor = "()V", line = 54)
	public void method33847() {
		@Pc(3) Class161 local3 = this.aClass161_75;
		synchronized (this.aClass161_75) {
			this.aClass161_75.method23224();
		}
		local3 = this.aClass161_76;
		synchronized (this.aClass161_76) {
			this.aClass161_76.method23224();
		}
	}

	@OriginalMember(owner = "client!zs", name = "l", descriptor = "(II)V", line = 63)
	public void method33837(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_75;
		synchronized (this.aClass161_75) {
			this.aClass161_75.method23240(arg0);
		}
		local3 = this.aClass161_76;
		synchronized (this.aClass161_76) {
			this.aClass161_76.method23240(arg0);
		}
	}

	@OriginalMember(owner = "client!zs", name = "h", descriptor = "(B)V", line = 72)
	public void method33838() {
		@Pc(3) Class161 local3 = this.aClass161_75;
		synchronized (this.aClass161_75) {
			this.aClass161_75.method23245();
		}
		local3 = this.aClass161_76;
		synchronized (this.aClass161_76) {
			this.aClass161_76.method23245();
		}
	}

	@OriginalMember(owner = "client!zs", name = "n", descriptor = "()V", line = 72)
	public void method33840() {
		@Pc(3) Class161 local3 = this.aClass161_75;
		synchronized (this.aClass161_75) {
			this.aClass161_75.method23245();
		}
		local3 = this.aClass161_76;
		synchronized (this.aClass161_76) {
			this.aClass161_76.method23245();
		}
	}

	@OriginalMember(owner = "client!zs", name = "j", descriptor = "()V", line = 72)
	public void method33846() {
		@Pc(3) Class161 local3 = this.aClass161_75;
		synchronized (this.aClass161_75) {
			this.aClass161_75.method23245();
		}
		local3 = this.aClass161_76;
		synchronized (this.aClass161_76) {
			this.aClass161_76.method23245();
		}
	}
}
