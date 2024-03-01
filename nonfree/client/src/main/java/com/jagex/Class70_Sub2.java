package com.jagex;

import java.awt.Canvas;
import java.util.Map;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!zy")
public class Class70_Sub2 extends Class70 {

	@OriginalMember(owner = "client!zy", name = "g", descriptor = "I")
	public static final int anInt5590 = 64;

	@OriginalMember(owner = "client!zy", name = "h", descriptor = "Lclient!ew;")
	Class161 aClass161_77 = new Class161(64);

	@OriginalMember(owner = "client!zy", name = "l", descriptor = "Lclient!ny;")
	final Class359 aClass359_121;

	@OriginalMember(owner = "client!zy", name = "a", descriptor = "Ljava/util/Map;")
	final Map aMap20;

	@OriginalMember(owner = "client!zy", name = "m", descriptor = "(Lclient!abl;Ljava/awt/Canvas;III)Lclient!aka;", line = 18)
	static Class19_Sub2_Sub2 method33900(@OriginalArg(0) Class21_Sub1 arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return new Class19_Sub2_Sub2_Sub1(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!zy", name = "<init>", descriptor = "(Lclient!vz;Lclient!vk;Lclient!ny;Ljava/util/Map;)V", line = 21)
	public Class70_Sub2(@OriginalArg(0) Class543 arg0, @OriginalArg(1) Class530 arg1, @OriginalArg(2) Class359 arg2, @OriginalArg(3) Map arg3) {
		super(arg0, arg1, arg2 == null ? 0 : arg2.method26682(Class185.aClass185_58.anInt3631 * -1739932335));
		this.aClass359_121 = arg2;
		this.aMap20 = arg3;
	}

	@OriginalMember(owner = "client!zy", name = "p", descriptor = "(II)Lclient!ky;", line = 28)
	public Class290 method33886(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_77;
		synchronized (this.aClass161_77) {
			@Pc(11) Class290 local11 = (Class290) this.aClass161_77.method23219((long) arg0);
			if (local11 == null) {
				@Pc(23) byte[] local23 = this.aClass359_121.method26713(Class185.aClass185_58.anInt3631 * -1739932335, arg0);
				local11 = new Class290();
				local11.anInt4367 = arg0 * 325634211;
				local11.aClass70_Sub2_2 = this;
				if (local23 != null) {
					local11.method25521(new Class3_Sub41(local23), false);
				}
				this.aClass161_77.method23222(local11, (long) arg0);
			}
			return local11;
		}
	}

	@OriginalMember(owner = "client!zy", name = "x", descriptor = "(I)Lclient!ky;", line = 28)
	public Class290 method33891(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_77;
		synchronized (this.aClass161_77) {
			@Pc(11) Class290 local11 = (Class290) this.aClass161_77.method23219((long) arg0);
			if (local11 == null) {
				@Pc(23) byte[] local23 = this.aClass359_121.method26713(Class185.aClass185_58.anInt3631 * -1739932335, arg0);
				local11 = new Class290();
				local11.anInt4367 = arg0 * 325634211;
				local11.aClass70_Sub2_2 = this;
				if (local23 != null) {
					local11.method25521(new Class3_Sub41(local23), false);
				}
				this.aClass161_77.method23222(local11, (long) arg0);
			}
			return local11;
		}
	}

	@OriginalMember(owner = "client!zy", name = "a", descriptor = "(B)V", line = 43)
	public void method33890() {
		@Pc(3) Class161 local3 = this.aClass161_77;
		synchronized (this.aClass161_77) {
			this.aClass161_77.method23224();
		}
	}

	@OriginalMember(owner = "client!zy", name = "g", descriptor = "(II)V", line = 49)
	public void method33888(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_77;
		synchronized (this.aClass161_77) {
			this.aClass161_77.method23240(arg0);
		}
	}

	@OriginalMember(owner = "client!zy", name = "u", descriptor = "(I)V", line = 49)
	public void method33892(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_77;
		synchronized (this.aClass161_77) {
			this.aClass161_77.method23240(arg0);
		}
	}

	@OriginalMember(owner = "client!zy", name = "s", descriptor = "(I)V", line = 49)
	public void method33895(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_77;
		synchronized (this.aClass161_77) {
			this.aClass161_77.method23240(arg0);
		}
	}

	@OriginalMember(owner = "client!zy", name = "y", descriptor = "()V", line = 55)
	public void method33885() {
		@Pc(3) Class161 local3 = this.aClass161_77;
		synchronized (this.aClass161_77) {
			this.aClass161_77.method23245();
		}
	}

	@OriginalMember(owner = "client!zy", name = "l", descriptor = "(I)V", line = 55)
	public void method33889() {
		@Pc(3) Class161 local3 = this.aClass161_77;
		synchronized (this.aClass161_77) {
			this.aClass161_77.method23245();
		}
	}

	@OriginalMember(owner = "client!zy", name = "b", descriptor = "()V", line = 55)
	public void method33894() {
		@Pc(3) Class161 local3 = this.aClass161_77;
		synchronized (this.aClass161_77) {
			this.aClass161_77.method23245();
		}
	}

	@OriginalMember(owner = "client!zy", name = "z", descriptor = "()V", line = 55)
	public void method33896() {
		@Pc(3) Class161 local3 = this.aClass161_77;
		synchronized (this.aClass161_77) {
			this.aClass161_77.method23245();
		}
	}

	@OriginalMember(owner = "client!zy", name = "c", descriptor = "()V", line = 55)
	public void method33898() {
		@Pc(3) Class161 local3 = this.aClass161_77;
		synchronized (this.aClass161_77) {
			this.aClass161_77.method23245();
		}
	}

	@OriginalMember(owner = "client!zy", name = "h", descriptor = "(II)V", line = 61)
	public void method33887(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_77;
		synchronized (this.aClass161_77) {
			this.aClass161_77.method23224();
			this.aClass161_77 = new Class161(arg0);
		}
	}

	@OriginalMember(owner = "client!zy", name = "n", descriptor = "(I)V", line = 61)
	public void method33893(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_77;
		synchronized (this.aClass161_77) {
			this.aClass161_77.method23224();
			this.aClass161_77 = new Class161(arg0);
		}
	}

	@OriginalMember(owner = "client!zy", name = "j", descriptor = "(I)V", line = 61)
	public void method33897(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_77;
		synchronized (this.aClass161_77) {
			this.aClass161_77.method23224();
			this.aClass161_77 = new Class161(arg0);
		}
	}

	@OriginalMember(owner = "client!zy", name = "e", descriptor = "(I)V", line = 61)
	public void method33899(@OriginalArg(0) int arg0) {
		@Pc(3) Class161 local3 = this.aClass161_77;
		synchronized (this.aClass161_77) {
			this.aClass161_77.method23224();
			this.aClass161_77 = new Class161(arg0);
		}
	}
}
