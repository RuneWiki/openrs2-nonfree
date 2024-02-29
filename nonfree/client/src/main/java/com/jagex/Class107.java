package com.jagex;

import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!im")
public abstract class Class107 {

	@OriginalMember(owner = "client!im", name = "z", descriptor = "F")
	public static final float aFloat106 = Float.POSITIVE_INFINITY;

	@OriginalMember(owner = "client!im", name = "ag", descriptor = "I")
	static final int anInt1041 = 50;

	@OriginalMember(owner = "client!im", name = "al", descriptor = "I")
	static final int anInt1042 = 10000;

	@OriginalMember(owner = "client!im", name = "ai", descriptor = "F")
	float aFloat103;

	@OriginalMember(owner = "client!im", name = "c", descriptor = "Lclient!ix;")
	Class334 aClass334_2;

	@OriginalMember(owner = "client!im", name = "v", descriptor = "Lclient!iz;")
	Class336 aClass336_2;

	@OriginalMember(owner = "client!im", name = "au", descriptor = "Z")
	boolean aBoolean191;

	@OriginalMember(owner = "client!im", name = "y", descriptor = "Lclient!zs;")
	Class149 aClass149_2;

	@OriginalMember(owner = "client!im", name = "t", descriptor = "Lclient!kq;")
	Class115 aClass115_2;

	@OriginalMember(owner = "client!im", name = "ao", descriptor = "F")
	float aFloat104;

	@OriginalMember(owner = "client!im", name = "x", descriptor = "Lclient!is;")
	Class330 aClass330_2;

	@OriginalMember(owner = "client!im", name = "d", descriptor = "I")
	int anInt1040;

	@OriginalMember(owner = "client!im", name = "s", descriptor = "F")
	float aFloat105;

	@OriginalMember(owner = "client!im", name = "ax", descriptor = "Z")
	boolean aBoolean192;

	@OriginalMember(owner = "client!im", name = "l", descriptor = "Lclient!ig;")
	Class321 aClass321_2;

	@OriginalMember(owner = "client!im", name = "w", descriptor = "Lclient!iu;")
	Class331 aClass331_2;

	@OriginalMember(owner = "client!im", name = "m", descriptor = "F")
	float aFloat112;

	@OriginalMember(owner = "client!im", name = "h", descriptor = "F")
	float aFloat113;

	@OriginalMember(owner = "client!im", name = "aj", descriptor = "F")
	float aFloat114;

	@OriginalMember(owner = "client!im", name = "ak", descriptor = "F")
	float aFloat116;

	@OriginalMember(owner = "client!im", name = "r", descriptor = "Lclient!oo;")
	final Class447 aClass447_10 = new Class447();

	@OriginalMember(owner = "client!im", name = "g", descriptor = "Lclient!oo;")
	final Class447 aClass447_12 = new Class447();

	@OriginalMember(owner = "client!im", name = "j", descriptor = "Lclient!oo;")
	final Class447 aClass447_13 = new Class447();

	@OriginalMember(owner = "client!im", name = "i", descriptor = "Lclient!oo;")
	final Class447 aClass447_11 = new Class447();

	@OriginalMember(owner = "client!im", name = "k", descriptor = "F")
	final float aFloat117 = 5120.0F;

	@OriginalMember(owner = "client!im", name = "u", descriptor = "F")
	final float aFloat108 = 10.0F;

	@OriginalMember(owner = "client!im", name = "e", descriptor = "F")
	final float aFloat115 = 1.0F;

	@OriginalMember(owner = "client!im", name = "f", descriptor = "F")
	float aFloat107 = 5120.0F;

	@OriginalMember(owner = "client!im", name = "o", descriptor = "F")
	float aFloat110 = 10.0F;

	@OriginalMember(owner = "client!im", name = "b", descriptor = "F")
	float aFloat111 = 1.0F;

	@OriginalMember(owner = "client!im", name = "n", descriptor = "Lclient!oo;")
	final Class447 aClass447_14 = new Class447();

	@OriginalMember(owner = "client!im", name = "a", descriptor = "Lclient!oo;")
	final Class447 aClass447_15 = new Class447();

	@OriginalMember(owner = "client!im", name = "ar", descriptor = "I")
	int anInt1043 = 0;

	@OriginalMember(owner = "client!im", name = "ad", descriptor = "F")
	float aFloat109 = 1.0F;

	@OriginalMember(owner = "client!im", name = "ac", descriptor = "Lclient!aak;")
	Class12 aClass12_7 = new Class12(8);

	@OriginalMember(owner = "client!im", name = "p", descriptor = "Lclient!iy;")
	final Class335 aClass335_2;

	@OriginalMember(owner = "client!im", name = "q", descriptor = "Lclient!ij;")
	final Interface29 anInterface29_2;

	@OriginalMember(owner = "client!im", name = "p", descriptor = "(I)[Lclient!if;", line = 12)
	static Class320[] method8774() {
		return new Class320[] { Class320.aClass320_2, Class320.aClass320_3, Class320.aClass320_1 };
	}

	@OriginalMember(owner = "client!im", name = "<init>", descriptor = "(Lclient!iy;Lclient!ij;)V", line = 68)
	Class107(@OriginalArg(0) Class335 arg0, @OriginalArg(1) Interface29 arg1) {
		this.aClass335_2 = arg0;
		this.anInterface29_2 = arg1;
		this.method8777(true);
	}

	@OriginalMember(owner = "client!im", name = "bj", descriptor = "(Z)V", line = 75)
	public void method8775(@OriginalArg(0) boolean arg0) {
		this.aClass336_2 = Class336.aClass336_3;
		this.aClass321_2 = null;
		this.aClass149_2 = null;
		this.aClass331_2 = null;
		this.aClass115_2 = null;
		if (Class335.aClass335_4 != this.aClass335_2 && arg0) {
			this.aClass334_2 = Class334.aClass334_4;
		} else {
			this.aClass334_2 = Class334.aClass334_3;
		}
		this.aClass330_2 = Class330.aClass330_3;
		this.aClass447_10.method29133(100.0F, 100.0F, 100.0F);
		this.aClass447_12.method29133(100.0F, 100.0F, 100.0F);
		this.aFloat105 = 0.05F;
		this.aClass447_13.method29133(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
		this.aClass447_11.method29133(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
		this.aClass447_14.method29133(1.0F, 1.0F, 1.0F);
		this.aClass447_15.method29133(1.0F, 1.0F, 1.0F);
		this.aFloat112 = 1.1F;
		this.aFloat113 = 1.1F;
		this.aFloat114 = 50.0F;
		this.aFloat103 = 10000.0F;
		this.aFloat116 = 1.5707964F;
		this.aFloat104 = 1.5707964F;
		this.anInt1040 = 1886551513;
		this.aBoolean191 = true;
		this.aBoolean192 = true;
		this.anInt1043 = 0;
		this.aFloat109 = 1.0F;
		this.aClass12_7.method188();
	}

	@OriginalMember(owner = "client!im", name = "bv", descriptor = "(Z)V", line = 75)
	public void method8776(@OriginalArg(0) boolean arg0) {
		this.aClass336_2 = Class336.aClass336_3;
		this.aClass321_2 = null;
		this.aClass149_2 = null;
		this.aClass331_2 = null;
		this.aClass115_2 = null;
		if (Class335.aClass335_4 != this.aClass335_2 && arg0) {
			this.aClass334_2 = Class334.aClass334_4;
		} else {
			this.aClass334_2 = Class334.aClass334_3;
		}
		this.aClass330_2 = Class330.aClass330_3;
		this.aClass447_10.method29133(100.0F, 100.0F, 100.0F);
		this.aClass447_12.method29133(100.0F, 100.0F, 100.0F);
		this.aFloat105 = 0.05F;
		this.aClass447_13.method29133(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
		this.aClass447_11.method29133(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
		this.aClass447_14.method29133(1.0F, 1.0F, 1.0F);
		this.aClass447_15.method29133(1.0F, 1.0F, 1.0F);
		this.aFloat112 = 1.1F;
		this.aFloat113 = 1.1F;
		this.aFloat114 = 50.0F;
		this.aFloat103 = 10000.0F;
		this.aFloat116 = 1.5707964F;
		this.aFloat104 = 1.5707964F;
		this.anInt1040 = 1886551513;
		this.aBoolean191 = true;
		this.aBoolean192 = true;
		this.anInt1043 = 0;
		this.aFloat109 = 1.0F;
		this.aClass12_7.method188();
	}

	@OriginalMember(owner = "client!im", name = "p", descriptor = "(ZI)V", line = 75)
	public void method8777(@OriginalArg(0) boolean arg0) {
		this.aClass336_2 = Class336.aClass336_3;
		this.aClass321_2 = null;
		this.aClass149_2 = null;
		this.aClass331_2 = null;
		this.aClass115_2 = null;
		if (Class335.aClass335_4 != this.aClass335_2 && arg0) {
			this.aClass334_2 = Class334.aClass334_4;
		} else {
			this.aClass334_2 = Class334.aClass334_3;
		}
		this.aClass330_2 = Class330.aClass330_3;
		this.aClass447_10.method29133(100.0F, 100.0F, 100.0F);
		this.aClass447_12.method29133(100.0F, 100.0F, 100.0F);
		this.aFloat105 = 0.05F;
		this.aClass447_13.method29133(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
		this.aClass447_11.method29133(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
		this.aClass447_14.method29133(1.0F, 1.0F, 1.0F);
		this.aClass447_15.method29133(1.0F, 1.0F, 1.0F);
		this.aFloat112 = 1.1F;
		this.aFloat113 = 1.1F;
		this.aFloat114 = 50.0F;
		this.aFloat103 = 10000.0F;
		this.aFloat116 = 1.5707964F;
		this.aFloat104 = 1.5707964F;
		this.anInt1040 = 1886551513;
		this.aBoolean191 = true;
		this.aBoolean192 = true;
		this.anInt1043 = 0;
		this.aFloat109 = 1.0F;
		this.aClass12_7.method188();
	}

	@OriginalMember(owner = "client!im", name = "c", descriptor = "(F[[[ILclient!ps;III)V", line = 105)
	public void method8778(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class474 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.aClass149_2 != null) {
			this.aClass149_2.method23156(arg0);
		}
		if (this.aClass115_2 != null) {
			this.aClass115_2.method21212(arg0, arg1, arg2, arg3, arg4);
		}
		@Pc(25) Iterator local25 = this.aClass12_7.iterator();
		while (local25.hasNext()) {
			@Pc(32) Class77_Sub1_Sub12 local32 = (Class77_Sub1_Sub12) local25.next();
			local32.method24012(arg0);
		}
	}

	@OriginalMember(owner = "client!im", name = "ba", descriptor = "(F[[[ILclient!ps;II)V", line = 105)
	public void method8779(@OriginalArg(0) float arg0, @OriginalArg(1) int[][][] arg1, @OriginalArg(2) Class474 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (this.aClass149_2 != null) {
			this.aClass149_2.method23156(arg0);
		}
		if (this.aClass115_2 != null) {
			this.aClass115_2.method21212(arg0, arg1, arg2, arg3, arg4);
		}
		@Pc(25) Iterator local25 = this.aClass12_7.iterator();
		while (local25.hasNext()) {
			@Pc(32) Class77_Sub1_Sub12 local32 = (Class77_Sub1_Sub12) local25.next();
			local32.method24012(arg0);
		}
	}

	@OriginalMember(owner = "client!im", name = "v", descriptor = "(ZFLclient!oo;Lclient!ot;Lclient!oo;Lclient!oo;B)V", line = 114)
	public void method8780(@OriginalArg(0) boolean arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class447 arg2, @OriginalArg(3) Class452 arg3, @OriginalArg(4) Class447 arg4, @OriginalArg(5) Class447 arg5) {
		if (this.aClass330_2 == Class330.aClass330_5) {
			Class571.method31467(arg1, arg2, arg4, arg5, arg0 ? this.aClass447_11 : this.aClass447_13, arg0 ? this.aClass447_12 : this.aClass447_10, (float) (this.anInt1043 * -1492160789), this.aFloat109, this.aFloat107, this.aFloat110);
		} else if (this.aClass330_2 == Class330.aClass330_3) {
			Class610.method32194(arg1, arg2, arg3, arg4, arg5, arg0 ? this.aClass447_11 : this.aClass447_13, arg0 ? this.aClass447_12 : this.aClass447_10, (float) (this.anInt1043 * -1492160789), this.aFloat109, this.aFloat107, this.aFloat110);
		} else if (this.aClass330_2 == Class330.aClass330_4) {
			Class24.method437(arg1, arg2, arg3, arg4, arg5, arg0 ? this.aClass447_15 : this.aClass447_14, arg0 ? this.aFloat113 : this.aFloat112, this.aFloat107, this.aFloat111);
		}
	}

	@OriginalMember(owner = "client!im", name = "bb", descriptor = "(ZFLclient!oo;Lclient!ot;Lclient!oo;Lclient!oo;)V", line = 114)
	public void method8781(@OriginalArg(0) boolean arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class447 arg2, @OriginalArg(3) Class452 arg3, @OriginalArg(4) Class447 arg4, @OriginalArg(5) Class447 arg5) {
		if (this.aClass330_2 == Class330.aClass330_5) {
			Class571.method31467(arg1, arg2, arg4, arg5, arg0 ? this.aClass447_11 : this.aClass447_13, arg0 ? this.aClass447_12 : this.aClass447_10, (float) (this.anInt1043 * -1492160789), this.aFloat109, this.aFloat107, this.aFloat110);
		} else if (this.aClass330_2 == Class330.aClass330_3) {
			Class610.method32194(arg1, arg2, arg3, arg4, arg5, arg0 ? this.aClass447_11 : this.aClass447_13, arg0 ? this.aClass447_12 : this.aClass447_10, (float) (this.anInt1043 * -1492160789), this.aFloat109, this.aFloat107, this.aFloat110);
		} else if (this.aClass330_2 == Class330.aClass330_4) {
			Class24.method437(arg1, arg2, arg3, arg4, arg5, arg0 ? this.aClass447_15 : this.aClass447_14, arg0 ? this.aFloat113 : this.aFloat112, this.aFloat107, this.aFloat111);
		}
	}

	@OriginalMember(owner = "client!im", name = "bd", descriptor = "(ZFLclient!oo;Lclient!ot;Lclient!oo;Lclient!oo;)V", line = 114)
	public void method8782(@OriginalArg(0) boolean arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class447 arg2, @OriginalArg(3) Class452 arg3, @OriginalArg(4) Class447 arg4, @OriginalArg(5) Class447 arg5) {
		if (this.aClass330_2 == Class330.aClass330_5) {
			Class571.method31467(arg1, arg2, arg4, arg5, arg0 ? this.aClass447_11 : this.aClass447_13, arg0 ? this.aClass447_12 : this.aClass447_10, (float) (this.anInt1043 * -1492160789), this.aFloat109, this.aFloat107, this.aFloat110);
		} else if (this.aClass330_2 == Class330.aClass330_3) {
			Class610.method32194(arg1, arg2, arg3, arg4, arg5, arg0 ? this.aClass447_11 : this.aClass447_13, arg0 ? this.aClass447_12 : this.aClass447_10, (float) (this.anInt1043 * -1492160789), this.aFloat109, this.aFloat107, this.aFloat110);
		} else if (this.aClass330_2 == Class330.aClass330_4) {
			Class24.method437(arg1, arg2, arg3, arg4, arg5, arg0 ? this.aClass447_15 : this.aClass447_14, arg0 ? this.aFloat113 : this.aFloat112, this.aFloat107, this.aFloat111);
		}
	}

	@OriginalMember(owner = "client!im", name = "bl", descriptor = "(ZFLclient!oo;Lclient!ot;Lclient!oo;Lclient!oo;)V", line = 114)
	public void method8783(@OriginalArg(0) boolean arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class447 arg2, @OriginalArg(3) Class452 arg3, @OriginalArg(4) Class447 arg4, @OriginalArg(5) Class447 arg5) {
		if (this.aClass330_2 == Class330.aClass330_5) {
			Class571.method31467(arg1, arg2, arg4, arg5, arg0 ? this.aClass447_11 : this.aClass447_13, arg0 ? this.aClass447_12 : this.aClass447_10, (float) (this.anInt1043 * -1492160789), this.aFloat109, this.aFloat107, this.aFloat110);
		} else if (this.aClass330_2 == Class330.aClass330_3) {
			Class610.method32194(arg1, arg2, arg3, arg4, arg5, arg0 ? this.aClass447_11 : this.aClass447_13, arg0 ? this.aClass447_12 : this.aClass447_10, (float) (this.anInt1043 * -1492160789), this.aFloat109, this.aFloat107, this.aFloat110);
		} else if (this.aClass330_2 == Class330.aClass330_4) {
			Class24.method437(arg1, arg2, arg3, arg4, arg5, arg0 ? this.aClass447_15 : this.aClass447_14, arg0 ? this.aFloat113 : this.aFloat112, this.aFloat107, this.aFloat111);
		}
	}

	@OriginalMember(owner = "client!im", name = "l", descriptor = "(Lclient!ix;B)V", line = 126)
	public void method8784(@OriginalArg(0) Class334 arg0) {
		this.aClass334_2 = arg0;
	}

	@OriginalMember(owner = "client!im", name = "by", descriptor = "(Lclient!ix;)V", line = 126)
	public void method8785(@OriginalArg(0) Class334 arg0) {
		this.aClass334_2 = arg0;
	}

	@OriginalMember(owner = "client!im", name = "bx", descriptor = "(Lclient!ix;)V", line = 126)
	public void method8786(@OriginalArg(0) Class334 arg0) {
		this.aClass334_2 = arg0;
	}

	@OriginalMember(owner = "client!im", name = "y", descriptor = "(Lclient!ig;ZB)Lclient!zs;", line = 130)
	public Class149 method8787(@OriginalArg(0) Class321 arg0, @OriginalArg(1) boolean arg1) throws Exception_Sub2 {
		if (Class334.aClass334_3 == this.aClass334_2 && !arg1) {
			throw new Exception_Sub2();
		}
		this.aClass321_2 = arg0;
		if (Class321.aClass321_4 == arg0) {
			this.aClass149_2 = new Class149_Sub4(this);
		} else if (arg0 == Class321.aClass321_3) {
			this.aClass149_2 = new Class149_Sub3(this);
		} else if (arg0 == Class321.aClass321_9) {
			this.aClass149_2 = new Class149_Sub1(this);
		} else if (Class321.aClass321_6 == arg0) {
			this.aClass149_2 = new Class149_Sub5_Sub1(this);
		} else if (arg0 == Class321.aClass321_5) {
			this.aClass149_2 = new Class149_Sub5_Sub3(this);
		} else if (arg0 == Class321.aClass321_7) {
			this.aClass149_2 = new Class149_Sub2(this);
		} else if (Class321.aClass321_8 == arg0) {
			this.aClass149_2 = new Class149_Sub5_Sub2(this);
		}
		return this.aClass149_2;
	}

	@OriginalMember(owner = "client!im", name = "w", descriptor = "(Lclient!iu;ZI)Lclient!kq;", line = 143)
	public Class115 method8788(@OriginalArg(0) Class331 arg0, @OriginalArg(1) boolean arg1) throws Exception_Sub2 {
		if (this.aClass334_2 == Class334.aClass334_3 && !arg1) {
			throw new Exception_Sub2();
		}
		this.aClass331_2 = arg0;
		if (Class331.aClass331_4 == arg0) {
			this.aClass115_2 = new Class115_Sub1(this);
		} else if (arg0 == Class331.aClass331_5) {
			this.aClass115_2 = new Class115_Sub2(this);
		} else if (arg0 == Class331.aClass331_7) {
			this.aClass115_2 = new Class115_Sub3_Sub2(this);
		} else if (Class331.aClass331_6 == arg0) {
			this.aClass115_2 = new Class115_Sub3_Sub3(this);
		} else if (Class331.aClass331_3 == arg0) {
			this.aClass115_2 = new Class115_Sub3_Sub1(this);
		}
		return this.aClass115_2;
	}

	@OriginalMember(owner = "client!im", name = "bw", descriptor = "(Lclient!iu;Z)Lclient!kq;", line = 143)
	public Class115 method8789(@OriginalArg(0) Class331 arg0, @OriginalArg(1) boolean arg1) throws Exception_Sub2 {
		if (this.aClass334_2 == Class334.aClass334_3 && !arg1) {
			throw new Exception_Sub2();
		}
		this.aClass331_2 = arg0;
		if (Class331.aClass331_4 == arg0) {
			this.aClass115_2 = new Class115_Sub1(this);
		} else if (arg0 == Class331.aClass331_5) {
			this.aClass115_2 = new Class115_Sub2(this);
		} else if (arg0 == Class331.aClass331_7) {
			this.aClass115_2 = new Class115_Sub3_Sub2(this);
		} else if (Class331.aClass331_6 == arg0) {
			this.aClass115_2 = new Class115_Sub3_Sub3(this);
		} else if (Class331.aClass331_3 == arg0) {
			this.aClass115_2 = new Class115_Sub3_Sub1(this);
		}
		return this.aClass115_2;
	}

	@OriginalMember(owner = "client!im", name = "bg", descriptor = "(Lclient!iu;Z)Lclient!kq;", line = 143)
	public Class115 method8790(@OriginalArg(0) Class331 arg0, @OriginalArg(1) boolean arg1) throws Exception_Sub2 {
		if (this.aClass334_2 == Class334.aClass334_3 && !arg1) {
			throw new Exception_Sub2();
		}
		this.aClass331_2 = arg0;
		if (Class331.aClass331_4 == arg0) {
			this.aClass115_2 = new Class115_Sub1(this);
		} else if (arg0 == Class331.aClass331_5) {
			this.aClass115_2 = new Class115_Sub2(this);
		} else if (arg0 == Class331.aClass331_7) {
			this.aClass115_2 = new Class115_Sub3_Sub2(this);
		} else if (Class331.aClass331_6 == arg0) {
			this.aClass115_2 = new Class115_Sub3_Sub3(this);
		} else if (Class331.aClass331_3 == arg0) {
			this.aClass115_2 = new Class115_Sub3_Sub1(this);
		}
		return this.aClass115_2;
	}

	@OriginalMember(owner = "client!im", name = "bs", descriptor = "(Lclient!iu;Z)Lclient!kq;", line = 143)
	public Class115 method8791(@OriginalArg(0) Class331 arg0, @OriginalArg(1) boolean arg1) throws Exception_Sub2 {
		if (this.aClass334_2 == Class334.aClass334_3 && !arg1) {
			throw new Exception_Sub2();
		}
		this.aClass331_2 = arg0;
		if (Class331.aClass331_4 == arg0) {
			this.aClass115_2 = new Class115_Sub1(this);
		} else if (arg0 == Class331.aClass331_5) {
			this.aClass115_2 = new Class115_Sub2(this);
		} else if (arg0 == Class331.aClass331_7) {
			this.aClass115_2 = new Class115_Sub3_Sub2(this);
		} else if (Class331.aClass331_6 == arg0) {
			this.aClass115_2 = new Class115_Sub3_Sub3(this);
		} else if (Class331.aClass331_3 == arg0) {
			this.aClass115_2 = new Class115_Sub3_Sub1(this);
		}
		return this.aClass115_2;
	}

	@OriginalMember(owner = "client!im", name = "bi", descriptor = "(Lclient!iu;Z)Lclient!kq;", line = 143)
	public Class115 method8792(@OriginalArg(0) Class331 arg0, @OriginalArg(1) boolean arg1) throws Exception_Sub2 {
		if (this.aClass334_2 == Class334.aClass334_3 && !arg1) {
			throw new Exception_Sub2();
		}
		this.aClass331_2 = arg0;
		if (Class331.aClass331_4 == arg0) {
			this.aClass115_2 = new Class115_Sub1(this);
		} else if (arg0 == Class331.aClass331_5) {
			this.aClass115_2 = new Class115_Sub2(this);
		} else if (arg0 == Class331.aClass331_7) {
			this.aClass115_2 = new Class115_Sub3_Sub2(this);
		} else if (Class331.aClass331_6 == arg0) {
			this.aClass115_2 = new Class115_Sub3_Sub3(this);
		} else if (Class331.aClass331_3 == arg0) {
			this.aClass115_2 = new Class115_Sub3_Sub1(this);
		}
		return this.aClass115_2;
	}

	@OriginalMember(owner = "client!im", name = "t", descriptor = "(S)Z", line = 154)
	boolean method8793() {
		if (this.aClass335_2 == Class335.aClass335_4 && this.aClass334_2 == Class334.aClass334_3) {
			return true;
		} else {
			return Class335.aClass335_3 == this.aClass335_2 && this.aClass334_2 == Class334.aClass334_4;
		}
	}

	@OriginalMember(owner = "client!im", name = "bz", descriptor = "()Z", line = 154)
	boolean method8794() {
		if (this.aClass335_2 == Class335.aClass335_4 && this.aClass334_2 == Class334.aClass334_3) {
			return true;
		} else {
			return Class335.aClass335_3 == this.aClass335_2 && this.aClass334_2 == Class334.aClass334_4;
		}
	}

	@OriginalMember(owner = "client!im", name = "bu", descriptor = "()Z", line = 154)
	boolean method8795() {
		if (this.aClass335_2 == Class335.aClass335_4 && this.aClass334_2 == Class334.aClass334_3) {
			return true;
		} else {
			return Class335.aClass335_3 == this.aClass335_2 && this.aClass334_2 == Class334.aClass334_4;
		}
	}

	@OriginalMember(owner = "client!im", name = "bt", descriptor = "()Z", line = 154)
	boolean method8796() {
		if (this.aClass335_2 == Class335.aClass335_4 && this.aClass334_2 == Class334.aClass334_3) {
			return true;
		} else {
			return Class335.aClass335_3 == this.aClass335_2 && this.aClass334_2 == Class334.aClass334_4;
		}
	}

	@OriginalMember(owner = "client!im", name = "q", descriptor = "(FI)V", line = 160)
	public void method8797(@OriginalArg(0) float arg0) throws Exception_Sub2 {
		if (!this.method8793()) {
			throw new Exception_Sub2();
		}
	}

	@OriginalMember(owner = "client!im", name = "bf", descriptor = "(F)V", line = 160)
	public void method8798(@OriginalArg(0) float arg0) throws Exception_Sub2 {
		if (!this.method8793()) {
			throw new Exception_Sub2();
		}
	}

	@OriginalMember(owner = "client!im", name = "x", descriptor = "(FI)V", line = 164)
	public void method8799(@OriginalArg(0) float arg0) throws Exception_Sub2 {
		if (!this.method8793()) {
			throw new Exception_Sub2();
		}
		this.aFloat105 = arg0;
	}

	@OriginalMember(owner = "client!im", name = "bp", descriptor = "(F)V", line = 164)
	public void method8800(@OriginalArg(0) float arg0) throws Exception_Sub2 {
		if (!this.method8793()) {
			throw new Exception_Sub2();
		}
		this.aFloat105 = arg0;
	}

	@OriginalMember(owner = "client!im", name = "bm", descriptor = "(F)V", line = 164)
	public void method8801(@OriginalArg(0) float arg0) throws Exception_Sub2 {
		if (!this.method8793()) {
			throw new Exception_Sub2();
		}
		this.aFloat105 = arg0;
	}

	@OriginalMember(owner = "client!im", name = "bn", descriptor = "(F)V", line = 164)
	public void method8802(@OriginalArg(0) float arg0) throws Exception_Sub2 {
		if (!this.method8793()) {
			throw new Exception_Sub2();
		}
		this.aFloat105 = arg0;
	}

	@OriginalMember(owner = "client!im", name = "d", descriptor = "(Lclient!is;B)V", line = 169)
	public void method8803(@OriginalArg(0) Class330 arg0) throws Exception_Sub2 {
		if (!this.method8793()) {
			throw new Exception_Sub2();
		}
		this.aClass330_2 = arg0;
	}

	@OriginalMember(owner = "client!im", name = "bo", descriptor = "(Lclient!is;)V", line = 169)
	public void method8804(@OriginalArg(0) Class330 arg0) throws Exception_Sub2 {
		if (!this.method8793()) {
			throw new Exception_Sub2();
		}
		this.aClass330_2 = arg0;
	}

	@OriginalMember(owner = "client!im", name = "bk", descriptor = "(Lclient!is;)V", line = 169)
	public void method8805(@OriginalArg(0) Class330 arg0) throws Exception_Sub2 {
		if (!this.method8793()) {
			throw new Exception_Sub2();
		}
		this.aClass330_2 = arg0;
	}

	@OriginalMember(owner = "client!im", name = "br", descriptor = "(Lclient!is;)V", line = 169)
	public void method8806(@OriginalArg(0) Class330 arg0) throws Exception_Sub2 {
		if (!this.method8793()) {
			throw new Exception_Sub2();
		}
		this.aClass330_2 = arg0;
	}

	@OriginalMember(owner = "client!im", name = "bq", descriptor = "(Lclient!is;)V", line = 169)
	public void method8807(@OriginalArg(0) Class330 arg0) throws Exception_Sub2 {
		if (!this.method8793()) {
			throw new Exception_Sub2();
		}
		this.aClass330_2 = arg0;
	}

	@OriginalMember(owner = "client!im", name = "bh", descriptor = "(Lclient!is;)V", line = 169)
	public void method8808(@OriginalArg(0) Class330 arg0) throws Exception_Sub2 {
		if (!this.method8793()) {
			throw new Exception_Sub2();
		}
		this.aClass330_2 = arg0;
	}

	@OriginalMember(owner = "client!im", name = "be", descriptor = "(Lclient!oo;)V", line = 174)
	public void method8809(@OriginalArg(0) Class447 arg0) throws Exception_Sub2 {
		if (!this.method8793() || !this.aClass330_2.aBoolean707) {
			throw new Exception_Sub2();
		}
		this.aClass447_13.method29136(arg0);
	}

	@OriginalMember(owner = "client!im", name = "s", descriptor = "(Lclient!oo;I)V", line = 174)
	public void method8810(@OriginalArg(0) Class447 arg0) throws Exception_Sub2 {
		if (!this.method8793() || !this.aClass330_2.aBoolean707) {
			throw new Exception_Sub2();
		}
		this.aClass447_13.method29136(arg0);
	}

	@OriginalMember(owner = "client!im", name = "cb", descriptor = "(Lclient!oo;)V", line = 179)
	public void method8811(@OriginalArg(0) Class447 arg0) throws Exception_Sub2 {
		if (!this.method8793() || !this.aClass330_2.aBoolean707) {
			throw new Exception_Sub2();
		}
		this.aClass447_11.method29136(arg0);
	}

	@OriginalMember(owner = "client!im", name = "cg", descriptor = "(Lclient!oo;)V", line = 179)
	public void method8812(@OriginalArg(0) Class447 arg0) throws Exception_Sub2 {
		if (!this.method8793() || !this.aClass330_2.aBoolean707) {
			throw new Exception_Sub2();
		}
		this.aClass447_11.method29136(arg0);
	}

	@OriginalMember(owner = "client!im", name = "cc", descriptor = "(Lclient!oo;)V", line = 179)
	public void method8813(@OriginalArg(0) Class447 arg0) throws Exception_Sub2 {
		if (!this.method8793() || !this.aClass330_2.aBoolean707) {
			throw new Exception_Sub2();
		}
		this.aClass447_11.method29136(arg0);
	}

	@OriginalMember(owner = "client!im", name = "r", descriptor = "(Lclient!oo;I)V", line = 179)
	public void method8814(@OriginalArg(0) Class447 arg0) throws Exception_Sub2 {
		if (!this.method8793() || !this.aClass330_2.aBoolean707) {
			throw new Exception_Sub2();
		}
		this.aClass447_11.method29136(arg0);
	}

	@OriginalMember(owner = "client!im", name = "g", descriptor = "(FFFS)V", line = 184)
	public void method8815(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) throws Exception_Sub2 {
		if (!this.method8793()) {
			throw new Exception_Sub2();
		}
		this.aFloat107 = arg0;
		this.aFloat110 = arg1;
		this.aFloat111 = arg2;
	}

	@OriginalMember(owner = "client!im", name = "cf", descriptor = "(FFF)V", line = 184)
	public void method8816(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) throws Exception_Sub2 {
		if (!this.method8793()) {
			throw new Exception_Sub2();
		}
		this.aFloat107 = arg0;
		this.aFloat110 = arg1;
		this.aFloat111 = arg2;
	}

	@OriginalMember(owner = "client!im", name = "z", descriptor = "(I)V", line = 191)
	public void method8817() throws Exception_Sub2 {
		if (!this.method8793()) {
			throw new Exception_Sub2();
		}
		this.aFloat107 = 5120.0F;
		this.aFloat110 = 10.0F;
		this.aFloat111 = 1.0F;
	}

	@OriginalMember(owner = "client!im", name = "ch", descriptor = "()V", line = 191)
	public void method8818() throws Exception_Sub2 {
		if (!this.method8793()) {
			throw new Exception_Sub2();
		}
		this.aFloat107 = 5120.0F;
		this.aFloat110 = 10.0F;
		this.aFloat111 = 1.0F;
	}

	@OriginalMember(owner = "client!im", name = "ck", descriptor = "()V", line = 191)
	public void method8819() throws Exception_Sub2 {
		if (!this.method8793()) {
			throw new Exception_Sub2();
		}
		this.aFloat107 = 5120.0F;
		this.aFloat110 = 10.0F;
		this.aFloat111 = 1.0F;
	}

	@OriginalMember(owner = "client!im", name = "cp", descriptor = "()V", line = 191)
	public void method8820() throws Exception_Sub2 {
		if (!this.method8793()) {
			throw new Exception_Sub2();
		}
		this.aFloat107 = 5120.0F;
		this.aFloat110 = 10.0F;
		this.aFloat111 = 1.0F;
	}

	@OriginalMember(owner = "client!im", name = "cw", descriptor = "()V", line = 191)
	public void method8821() throws Exception_Sub2 {
		if (!this.method8793()) {
			throw new Exception_Sub2();
		}
		this.aFloat107 = 5120.0F;
		this.aFloat110 = 10.0F;
		this.aFloat111 = 1.0F;
	}

	@OriginalMember(owner = "client!im", name = "cz", descriptor = "()V", line = 191)
	public void method8822() throws Exception_Sub2 {
		if (!this.method8793()) {
			throw new Exception_Sub2();
		}
		this.aFloat107 = 5120.0F;
		this.aFloat110 = 10.0F;
		this.aFloat111 = 1.0F;
	}

	@OriginalMember(owner = "client!im", name = "cl", descriptor = "()V", line = 191)
	public void method8823() throws Exception_Sub2 {
		if (!this.method8793()) {
			throw new Exception_Sub2();
		}
		this.aFloat107 = 5120.0F;
		this.aFloat110 = 10.0F;
		this.aFloat111 = 1.0F;
	}

	@OriginalMember(owner = "client!im", name = "j", descriptor = "(Lclient!oo;I)V", line = 198)
	public void method8824(@OriginalArg(0) Class447 arg0) throws Exception_Sub2 {
		if (!this.method8793() || !this.aClass330_2.aBoolean707) {
			throw new Exception_Sub2();
		}
		this.aClass447_10.method29136(arg0);
	}

	@OriginalMember(owner = "client!im", name = "ca", descriptor = "(Lclient!oo;)V", line = 198)
	public void method8825(@OriginalArg(0) Class447 arg0) throws Exception_Sub2 {
		if (!this.method8793() || !this.aClass330_2.aBoolean707) {
			throw new Exception_Sub2();
		}
		this.aClass447_10.method29136(arg0);
	}

	@OriginalMember(owner = "client!im", name = "cr", descriptor = "(Lclient!oo;)V", line = 198)
	public void method8826(@OriginalArg(0) Class447 arg0) throws Exception_Sub2 {
		if (!this.method8793() || !this.aClass330_2.aBoolean707) {
			throw new Exception_Sub2();
		}
		this.aClass447_10.method29136(arg0);
	}

	@OriginalMember(owner = "client!im", name = "i", descriptor = "(Lclient!oo;I)V", line = 203)
	public void method8827(@OriginalArg(0) Class447 arg0) throws Exception_Sub2 {
		if (!this.method8793() || !this.aClass330_2.aBoolean707) {
			throw new Exception_Sub2();
		}
		this.aClass447_12.method29136(arg0);
	}

	@OriginalMember(owner = "client!im", name = "k", descriptor = "(Lclient!oo;FB)V", line = 208)
	public void method8828(@OriginalArg(0) Class447 arg0, @OriginalArg(1) float arg1) throws Exception_Sub2 {
		if (!this.method8793() || this.aClass330_2.aBoolean707) {
			throw new Exception_Sub2();
		}
		this.aClass447_14.method29136(arg0);
		this.aClass447_15.method29136(arg0);
		this.aFloat112 = arg1;
		this.aFloat113 = arg1;
	}

	@OriginalMember(owner = "client!im", name = "cx", descriptor = "(Lclient!oo;F)V", line = 208)
	public void method8829(@OriginalArg(0) Class447 arg0, @OriginalArg(1) float arg1) throws Exception_Sub2 {
		if (!this.method8793() || this.aClass330_2.aBoolean707) {
			throw new Exception_Sub2();
		}
		this.aClass447_14.method29136(arg0);
		this.aClass447_15.method29136(arg0);
		this.aFloat112 = arg1;
		this.aFloat113 = arg1;
	}

	@OriginalMember(owner = "client!im", name = "ct", descriptor = "(Lclient!oo;F)V", line = 208)
	public void method8830(@OriginalArg(0) Class447 arg0, @OriginalArg(1) float arg1) throws Exception_Sub2 {
		if (!this.method8793() || this.aClass330_2.aBoolean707) {
			throw new Exception_Sub2();
		}
		this.aClass447_14.method29136(arg0);
		this.aClass447_15.method29136(arg0);
		this.aFloat112 = arg1;
		this.aFloat113 = arg1;
	}

	@OriginalMember(owner = "client!im", name = "cv", descriptor = "(Lclient!oo;F)V", line = 208)
	public void method8831(@OriginalArg(0) Class447 arg0, @OriginalArg(1) float arg1) throws Exception_Sub2 {
		if (!this.method8793() || this.aClass330_2.aBoolean707) {
			throw new Exception_Sub2();
		}
		this.aClass447_14.method29136(arg0);
		this.aClass447_15.method29136(arg0);
		this.aFloat112 = arg1;
		this.aFloat113 = arg1;
	}

	@OriginalMember(owner = "client!im", name = "u", descriptor = "(Lclient!oo;FB)V", line = 216)
	public void method8832(@OriginalArg(0) Class447 arg0, @OriginalArg(1) float arg1) throws Exception_Sub2 {
		if (!this.method8793() || this.aClass330_2.aBoolean707) {
			throw new Exception_Sub2();
		}
		this.aClass447_14.method29136(arg0);
		this.aFloat112 = arg1;
	}

	@OriginalMember(owner = "client!im", name = "cu", descriptor = "(Lclient!oo;F)V", line = 216)
	public void method8833(@OriginalArg(0) Class447 arg0, @OriginalArg(1) float arg1) throws Exception_Sub2 {
		if (!this.method8793() || this.aClass330_2.aBoolean707) {
			throw new Exception_Sub2();
		}
		this.aClass447_14.method29136(arg0);
		this.aFloat112 = arg1;
	}

	@OriginalMember(owner = "client!im", name = "e", descriptor = "(Lclient!oo;FI)V", line = 222)
	public void method8834(@OriginalArg(0) Class447 arg0, @OriginalArg(1) float arg1) throws Exception_Sub2 {
		if (!this.method8793() || this.aClass330_2.aBoolean707) {
			throw new Exception_Sub2();
		}
		this.aClass447_15.method29136(arg0);
		this.aFloat113 = arg1;
	}

	@OriginalMember(owner = "client!im", name = "cm", descriptor = "(Lclient!oo;F)V", line = 222)
	public void method8835(@OriginalArg(0) Class447 arg0, @OriginalArg(1) float arg1) throws Exception_Sub2 {
		if (!this.method8793() || this.aClass330_2.aBoolean707) {
			throw new Exception_Sub2();
		}
		this.aClass447_15.method29136(arg0);
		this.aFloat113 = arg1;
	}

	@OriginalMember(owner = "client!im", name = "ci", descriptor = "(Lclient!oo;F)V", line = 222)
	public void method8836(@OriginalArg(0) Class447 arg0, @OriginalArg(1) float arg1) throws Exception_Sub2 {
		if (!this.method8793() || this.aClass330_2.aBoolean707) {
			throw new Exception_Sub2();
		}
		this.aClass447_15.method29136(arg0);
		this.aFloat113 = arg1;
	}

	@OriginalMember(owner = "client!im", name = "co", descriptor = "(Lclient!oo;F)V", line = 222)
	public void method8837(@OriginalArg(0) Class447 arg0, @OriginalArg(1) float arg1) throws Exception_Sub2 {
		if (!this.method8793() || this.aClass330_2.aBoolean707) {
			throw new Exception_Sub2();
		}
		this.aClass447_15.method29136(arg0);
		this.aFloat113 = arg1;
	}

	@OriginalMember(owner = "client!im", name = "cn", descriptor = "(Lclient!oo;F)V", line = 222)
	public void method8838(@OriginalArg(0) Class447 arg0, @OriginalArg(1) float arg1) throws Exception_Sub2 {
		if (!this.method8793() || this.aClass330_2.aBoolean707) {
			throw new Exception_Sub2();
		}
		this.aClass447_15.method29136(arg0);
		this.aFloat113 = arg1;
	}

	@OriginalMember(owner = "client!im", name = "f", descriptor = "(FFI)V", line = 228)
	public void method8839(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) throws Exception_Sub2 {
		if (!this.method8793()) {
			throw new Exception_Sub2();
		}
		if (arg0 < 1.0F) {
			arg0 = 50.0F;
		}
		if (arg1 < 1.0F) {
			arg1 = 10000.0F;
		}
		if (arg0 >= arg1) {
			throw new Exception_Sub2();
		}
		this.aFloat114 = arg0;
		this.aFloat103 = arg1;
	}

	@OriginalMember(owner = "client!im", name = "cq", descriptor = "(FF)V", line = 228)
	public void method8840(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) throws Exception_Sub2 {
		if (!this.method8793()) {
			throw new Exception_Sub2();
		}
		if (arg0 < 1.0F) {
			arg0 = 50.0F;
		}
		if (arg1 < 1.0F) {
			arg1 = 10000.0F;
		}
		if (arg0 >= arg1) {
			throw new Exception_Sub2();
		}
		this.aFloat114 = arg0;
		this.aFloat103 = arg1;
	}

	@OriginalMember(owner = "client!im", name = "cy", descriptor = "(FF)V", line = 228)
	public void method8841(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) throws Exception_Sub2 {
		if (!this.method8793()) {
			throw new Exception_Sub2();
		}
		if (arg0 < 1.0F) {
			arg0 = 50.0F;
		}
		if (arg1 < 1.0F) {
			arg1 = 10000.0F;
		}
		if (arg0 >= arg1) {
			throw new Exception_Sub2();
		}
		this.aFloat114 = arg0;
		this.aFloat103 = arg1;
	}

	@OriginalMember(owner = "client!im", name = "o", descriptor = "(FFB)V", line = 237)
	public void method8842(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) throws Exception_Sub2 {
		if (!this.method8793()) {
			throw new Exception_Sub2();
		}
		this.aFloat104 = arg0;
		this.aFloat116 = arg1;
	}

	@OriginalMember(owner = "client!im", name = "b", descriptor = "(ZZI)V", line = 243)
	public void method8843(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) throws Exception_Sub2 {
		if (!this.method8793()) {
			throw new Exception_Sub2();
		}
		this.aBoolean191 = arg0;
		this.aBoolean192 = arg1;
	}

	@OriginalMember(owner = "client!im", name = "cs", descriptor = "(ZZ)V", line = 243)
	public void method8844(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) throws Exception_Sub2 {
		if (!this.method8793()) {
			throw new Exception_Sub2();
		}
		this.aBoolean191 = arg0;
		this.aBoolean192 = arg1;
	}

	@OriginalMember(owner = "client!im", name = "n", descriptor = "(IFI)V", line = 249)
	public void method8845(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) throws Exception_Sub2 {
		if (!this.method8793() || !this.aClass330_2.aBoolean707) {
			throw new Exception_Sub2();
		}
		this.anInt1043 = arg0 * 695781827;
		this.aFloat109 = arg1;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(Lclient!arg;I)V", line = 255)
	public void method8846(@OriginalArg(0) Class77_Sub1_Sub12 arg0) {
		this.aClass12_7.method184(arg0, (long) (arg0.anInt3212 * -997430305));
	}

	@OriginalMember(owner = "client!im", name = "dh", descriptor = "(Lclient!arg;)V", line = 255)
	public void method8847(@OriginalArg(0) Class77_Sub1_Sub12 arg0) {
		this.aClass12_7.method184(arg0, (long) (arg0.anInt3212 * -997430305));
	}

	@OriginalMember(owner = "client!im", name = "cj", descriptor = "(Lclient!arg;)V", line = 255)
	public void method8848(@OriginalArg(0) Class77_Sub1_Sub12 arg0) {
		this.aClass12_7.method184(arg0, (long) (arg0.anInt3212 * -997430305));
	}

	@OriginalMember(owner = "client!im", name = "do", descriptor = "(Lclient!arg;)V", line = 255)
	public void method8849(@OriginalArg(0) Class77_Sub1_Sub12 arg0) {
		this.aClass12_7.method184(arg0, (long) (arg0.anInt3212 * -997430305));
	}

	@OriginalMember(owner = "client!im", name = "ce", descriptor = "(Lclient!arg;)V", line = 255)
	public void method8850(@OriginalArg(0) Class77_Sub1_Sub12 arg0) {
		this.aClass12_7.method184(arg0, (long) (arg0.anInt3212 * -997430305));
	}

	@OriginalMember(owner = "client!im", name = "dt", descriptor = "(Lclient!arg;)V", line = 255)
	public void method8851(@OriginalArg(0) Class77_Sub1_Sub12 arg0) {
		this.aClass12_7.method184(arg0, (long) (arg0.anInt3212 * -997430305));
	}

	@OriginalMember(owner = "client!im", name = "cd", descriptor = "(Lclient!arg;)V", line = 255)
	public void method8852(@OriginalArg(0) Class77_Sub1_Sub12 arg0) {
		this.aClass12_7.method184(arg0, (long) (arg0.anInt3212 * -997430305));
	}

	@OriginalMember(owner = "client!im", name = "m", descriptor = "(IB)V", line = 259)
	public void method8853(@OriginalArg(0) int arg0) {
		@Pc(6) Class77_Sub1_Sub12 local6 = (Class77_Sub1_Sub12) this.aClass12_7.method173((long) arg0);
		if (local6 != null) {
			local6.method24063();
		}
	}

	@OriginalMember(owner = "client!im", name = "dn", descriptor = "(I)V", line = 259)
	public void method8854(@OriginalArg(0) int arg0) {
		@Pc(6) Class77_Sub1_Sub12 local6 = (Class77_Sub1_Sub12) this.aClass12_7.method173((long) arg0);
		if (local6 != null) {
			local6.method24063();
		}
	}

	@OriginalMember(owner = "client!im", name = "dq", descriptor = "(I)V", line = 259)
	public void method8855(@OriginalArg(0) int arg0) {
		@Pc(6) Class77_Sub1_Sub12 local6 = (Class77_Sub1_Sub12) this.aClass12_7.method173((long) arg0);
		if (local6 != null) {
			local6.method24063();
		}
	}

	@OriginalMember(owner = "client!im", name = "h", descriptor = "(II)Lclient!arg;", line = 264)
	public Class77_Sub1_Sub12 method8856(@OriginalArg(0) int arg0) {
		return (Class77_Sub1_Sub12) this.aClass12_7.method173((long) arg0);
	}

	@OriginalMember(owner = "client!im", name = "dv", descriptor = "(I)Lclient!arg;", line = 264)
	public Class77_Sub1_Sub12 method8857(@OriginalArg(0) int arg0) {
		return (Class77_Sub1_Sub12) this.aClass12_7.method173((long) arg0);
	}

	@OriginalMember(owner = "client!im", name = "da", descriptor = "(I)Lclient!arg;", line = 264)
	public Class77_Sub1_Sub12 method8858(@OriginalArg(0) int arg0) {
		return (Class77_Sub1_Sub12) this.aClass12_7.method173((long) arg0);
	}

	@OriginalMember(owner = "client!im", name = "dy", descriptor = "()V", line = 268)
	public void method8859() {
		this.aClass12_7.method188();
	}

	@OriginalMember(owner = "client!im", name = "aj", descriptor = "(B)V", line = 268)
	public void method8860() {
		this.aClass12_7.method188();
	}

	@OriginalMember(owner = "client!im", name = "dm", descriptor = "()V", line = 268)
	public void method8861() {
		this.aClass12_7.method188();
	}

	@OriginalMember(owner = "client!im", name = "dz", descriptor = "()V", line = 268)
	public void method8862() {
		this.aClass12_7.method188();
	}

	@OriginalMember(owner = "client!im", name = "di", descriptor = "()Z", line = 272)
	public boolean method8863() {
		if (this.aClass149_2 == null || this.aClass115_2 == null) {
			return false;
		} else if (this.aClass149_2.method23154()) {
			return this.aClass115_2.method21207();
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!im", name = "ai", descriptor = "(I)Z", line = 272)
	public boolean method8864() {
		if (this.aClass149_2 == null || this.aClass115_2 == null) {
			return false;
		} else if (this.aClass149_2.method23154()) {
			return this.aClass115_2.method21207();
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!im", name = "dw", descriptor = "()Z", line = 272)
	public boolean method8865() {
		if (this.aClass149_2 == null || this.aClass115_2 == null) {
			return false;
		} else if (this.aClass149_2.method23154()) {
			return this.aClass115_2.method21207();
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!im", name = "dr", descriptor = "()Z", line = 272)
	public boolean method8866() {
		if (this.aClass149_2 == null || this.aClass115_2 == null) {
			return false;
		} else if (this.aClass149_2.method23154()) {
			return this.aClass115_2.method21207();
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!im", name = "ag", descriptor = "(Lclient!ia;Lclient!ow;Lclient!oi;III)V", line = 279)
	public void method8867(@OriginalArg(0) Class315 arg0, @OriginalArg(1) Class455 arg1, @OriginalArg(2) Class442 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (!this.method8864()) {
			return;
		}
		this.aClass149_2.method23157(arg0, arg1, arg3, arg4, this.aClass115_2.method21210());
		this.aClass115_2.method21225(arg0, arg3, arg4);
		if (Class336.aClass336_3 == this.aClass336_2) {
			arg2.method28996(this.aFloat114, this.aFloat103, this.aFloat104, this.aFloat116);
		} else {
			arg2.method29000(this.aFloat114, this.aFloat103, (float) (this.anInt1040 * -503383027));
		}
		@Pc(52) Iterator local52 = this.aClass12_7.iterator();
		while (local52.hasNext()) {
			@Pc(59) Class77_Sub1_Sub12 local59 = (Class77_Sub1_Sub12) local52.next();
			local59.method24013(arg0, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!im", name = "dp", descriptor = "()Lclient!ix;", line = 292)
	public Class334 method8868() {
		return this.aClass334_2;
	}

	@OriginalMember(owner = "client!im", name = "de", descriptor = "()Lclient!ix;", line = 292)
	public Class334 method8869() {
		return this.aClass334_2;
	}

	@OriginalMember(owner = "client!im", name = "al", descriptor = "(I)Lclient!ix;", line = 292)
	public Class334 method8870() {
		return this.aClass334_2;
	}

	@OriginalMember(owner = "client!im", name = "ao", descriptor = "(B)Lclient!kq;", line = 296)
	public Class115 method8871() {
		return this.aClass115_2;
	}

	@OriginalMember(owner = "client!im", name = "du", descriptor = "()Lclient!kq;", line = 296)
	public Class115 method8872() {
		return this.aClass115_2;
	}

	@OriginalMember(owner = "client!im", name = "ak", descriptor = "(I)Lclient!zs;", line = 300)
	public Class149 method8873() {
		return this.aClass149_2;
	}

	@OriginalMember(owner = "client!im", name = "ds", descriptor = "()Lclient!zs;", line = 300)
	public Class149 method8874() {
		return this.aClass149_2;
	}

	@OriginalMember(owner = "client!im", name = "df", descriptor = "()Lclient!zs;", line = 300)
	public Class149 method8875() {
		return this.aClass149_2;
	}

	@OriginalMember(owner = "client!im", name = "dk", descriptor = "()Lclient!zs;", line = 300)
	public Class149 method8876() {
		return this.aClass149_2;
	}

	@OriginalMember(owner = "client!im", name = "au", descriptor = "(I)Lclient!ij;", line = 304)
	public Interface29 method8877() {
		return this.anInterface29_2;
	}

	@OriginalMember(owner = "client!im", name = "db", descriptor = "()Lclient!ij;", line = 304)
	public Interface29 method8878() {
		return this.anInterface29_2;
	}

	@OriginalMember(owner = "client!im", name = "ax", descriptor = "(I)Lclient!ig;", line = 308)
	public Class321 method8879() {
		return this.aClass321_2;
	}

	@OriginalMember(owner = "client!im", name = "ar", descriptor = "(B)Lclient!iu;", line = 312)
	public Class331 method8880() {
		return this.aClass331_2;
	}

	@OriginalMember(owner = "client!im", name = "dc", descriptor = "()Lclient!iu;", line = 312)
	public Class331 method8881() {
		return this.aClass331_2;
	}

	@OriginalMember(owner = "client!im", name = "dx", descriptor = "()Lclient!iu;", line = 312)
	public Class331 method8882() {
		return this.aClass331_2;
	}

	@OriginalMember(owner = "client!im", name = "ad", descriptor = "(B)Lclient!oo;", line = 316)
	public Class447 method8883() {
		return this.aClass115_2 != null && this.aClass115_2.method21207() ? this.aClass115_2.method21213() : null;
	}

	@OriginalMember(owner = "client!im", name = "dl", descriptor = "()Lclient!oo;", line = 316)
	public Class447 method8884() {
		return this.aClass115_2 != null && this.aClass115_2.method21207() ? this.aClass115_2.method21213() : null;
	}

	@OriginalMember(owner = "client!im", name = "ac", descriptor = "(I)[D", line = 321)
	public double[] method8885() {
		return this.aClass115_2 != null && this.aClass115_2.method21207() ? this.aClass115_2.method21206() : null;
	}

	@OriginalMember(owner = "client!im", name = "dd", descriptor = "()[D", line = 321)
	public double[] method8886() {
		return this.aClass115_2 != null && this.aClass115_2.method21207() ? this.aClass115_2.method21206() : null;
	}

	@OriginalMember(owner = "client!im", name = "dg", descriptor = "()[D", line = 321)
	public double[] method8887() {
		return this.aClass115_2 != null && this.aClass115_2.method21207() ? this.aClass115_2.method21206() : null;
	}

	@OriginalMember(owner = "client!im", name = "eh", descriptor = "()Lclient!oo;", line = 326)
	public Class447 method8888() {
		return this.aClass149_2 != null && this.aClass149_2.method23154() ? this.aClass149_2.method23153() : null;
	}

	@OriginalMember(owner = "client!im", name = "av", descriptor = "(I)Lclient!oo;", line = 326)
	public Class447 method8889() {
		return this.aClass149_2 != null && this.aClass149_2.method23154() ? this.aClass149_2.method23153() : null;
	}

	@OriginalMember(owner = "client!im", name = "dj", descriptor = "()Lclient!oo;", line = 326)
	public Class447 method8890() {
		return this.aClass149_2 != null && this.aClass149_2.method23154() ? this.aClass149_2.method23153() : null;
	}

	@OriginalMember(owner = "client!im", name = "at", descriptor = "(B)Lclient!aks;", line = 331)
	public Class77_Sub36 method8891() {
		return this.aClass115_2 != null && this.aClass115_2.method21207() ? this.aClass115_2.method21209() : null;
	}

	@OriginalMember(owner = "client!im", name = "ej", descriptor = "()Lclient!aks;", line = 331)
	public Class77_Sub36 method8892() {
		return this.aClass115_2 != null && this.aClass115_2.method21207() ? this.aClass115_2.method21209() : null;
	}

	@OriginalMember(owner = "client!im", name = "eo", descriptor = "()Lclient!aks;", line = 331)
	public Class77_Sub36 method8893() {
		return this.aClass115_2 != null && this.aClass115_2.method21207() ? this.aClass115_2.method21209() : null;
	}

	@OriginalMember(owner = "client!im", name = "ae", descriptor = "(I)F", line = 336)
	public float method8894() {
		@Pc(3) Class447 local3 = this.method8883();
		@Pc(7) Class447 local7 = this.method8889();
		@Pc(9) float local9 = 0.0F;
		if (local3 != null && local7 != null) {
			@Pc(18) Class447 local18 = Class447.method29160(local7, local3);
			@Pc(33) float local33 = (float) Math.sqrt((double) (local18.aFloat278 * local18.aFloat278 + local18.aFloat277 * local18.aFloat277));
			local9 = (float) Math.atan2((double) -local18.aFloat276, (double) local33);
			local3.method29130();
			local7.method29130();
		}
		return local9;
	}

	@OriginalMember(owner = "client!im", name = "ep", descriptor = "()F", line = 336)
	public float method8895() {
		@Pc(3) Class447 local3 = this.method8883();
		@Pc(7) Class447 local7 = this.method8889();
		@Pc(9) float local9 = 0.0F;
		if (local3 != null && local7 != null) {
			@Pc(18) Class447 local18 = Class447.method29160(local7, local3);
			@Pc(33) float local33 = (float) Math.sqrt((double) (local18.aFloat278 * local18.aFloat278 + local18.aFloat277 * local18.aFloat277));
			local9 = (float) Math.atan2((double) -local18.aFloat276, (double) local33);
			local3.method29130();
			local7.method29130();
		}
		return local9;
	}

	@OriginalMember(owner = "client!im", name = "eq", descriptor = "()F", line = 336)
	public float method8896() {
		@Pc(3) Class447 local3 = this.method8883();
		@Pc(7) Class447 local7 = this.method8889();
		@Pc(9) float local9 = 0.0F;
		if (local3 != null && local7 != null) {
			@Pc(18) Class447 local18 = Class447.method29160(local7, local3);
			@Pc(33) float local33 = (float) Math.sqrt((double) (local18.aFloat278 * local18.aFloat278 + local18.aFloat277 * local18.aFloat277));
			local9 = (float) Math.atan2((double) -local18.aFloat276, (double) local33);
			local3.method29130();
			local7.method29130();
		}
		return local9;
	}

	@OriginalMember(owner = "client!im", name = "es", descriptor = "()F", line = 336)
	public float method8897() {
		@Pc(3) Class447 local3 = this.method8883();
		@Pc(7) Class447 local7 = this.method8889();
		@Pc(9) float local9 = 0.0F;
		if (local3 != null && local7 != null) {
			@Pc(18) Class447 local18 = Class447.method29160(local7, local3);
			@Pc(33) float local33 = (float) Math.sqrt((double) (local18.aFloat278 * local18.aFloat278 + local18.aFloat277 * local18.aFloat277));
			local9 = (float) Math.atan2((double) -local18.aFloat276, (double) local33);
			local3.method29130();
			local7.method29130();
		}
		return local9;
	}

	@OriginalMember(owner = "client!im", name = "ei", descriptor = "()F", line = 350)
	public float method8898() {
		@Pc(3) Class447 local3 = this.method8883();
		@Pc(7) Class447 local7 = this.method8889();
		@Pc(9) float local9 = 0.0F;
		if (local3 != null && local7 != null) {
			@Pc(17) Class447 local17 = Class447.method29160(local3, local7);
			local17.aFloat276 = 0.0F;
			local9 = (float) Math.atan2((double) local17.aFloat277, (double) local17.aFloat278);
			local3.method29130();
			local7.method29130();
		}
		return (float) (3.141592653589793D - (double) local9);
	}

	@OriginalMember(owner = "client!im", name = "ah", descriptor = "(I)F", line = 350)
	public float method8899() {
		@Pc(3) Class447 local3 = this.method8883();
		@Pc(7) Class447 local7 = this.method8889();
		@Pc(9) float local9 = 0.0F;
		if (local3 != null && local7 != null) {
			@Pc(17) Class447 local17 = Class447.method29160(local3, local7);
			local17.aFloat276 = 0.0F;
			local9 = (float) Math.atan2((double) local17.aFloat277, (double) local17.aFloat278);
			local3.method29130();
			local7.method29130();
		}
		return (float) (3.141592653589793D - (double) local9);
	}

	@OriginalMember(owner = "client!im", name = "as", descriptor = "(B)F", line = 364)
	float method8900() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!im", name = "ed", descriptor = "()F", line = 364)
	float method8901() {
		return 0.0F;
	}

	@OriginalMember(owner = "client!im", name = "aq", descriptor = "(B)Lclient!ot;", line = 368)
	public Class452 method8902() {
		@Pc(1) Class452 local1 = Class452.method29269();
		local1.method29295(this.method8899(), this.method8894(), this.method8900());
		return local1;
	}

	@OriginalMember(owner = "client!im", name = "ee", descriptor = "()Lclient!ot;", line = 368)
	public Class452 method8903() {
		@Pc(1) Class452 local1 = Class452.method29269();
		local1.method29295(this.method8899(), this.method8894(), this.method8900());
		return local1;
	}

	@OriginalMember(owner = "client!im", name = "en", descriptor = "()Lclient!ot;", line = 368)
	public Class452 method8904() {
		@Pc(1) Class452 local1 = Class452.method29269();
		local1.method29295(this.method8899(), this.method8894(), this.method8900());
		return local1;
	}

	@OriginalMember(owner = "client!im", name = "er", descriptor = "()Lclient!oo;", line = 374)
	public Class447 method8905() {
		return this.aClass447_13;
	}

	@OriginalMember(owner = "client!im", name = "am", descriptor = "(B)Lclient!oo;", line = 374)
	public Class447 method8906() {
		return this.aClass447_13;
	}

	@OriginalMember(owner = "client!im", name = "ex", descriptor = "()Lclient!oo;", line = 374)
	public Class447 method8907() {
		return this.aClass447_13;
	}

	@OriginalMember(owner = "client!im", name = "ef", descriptor = "()Lclient!oo;", line = 374)
	public Class447 method8908() {
		return this.aClass447_13;
	}

	@OriginalMember(owner = "client!im", name = "em", descriptor = "()Lclient!oo;", line = 374)
	public Class447 method8909() {
		return this.aClass447_13;
	}

	@OriginalMember(owner = "client!im", name = "ay", descriptor = "(I)Lclient!oo;", line = 378)
	public Class447 method8910() {
		return this.aClass447_11;
	}

	@OriginalMember(owner = "client!im", name = "et", descriptor = "()Lclient!oo;", line = 378)
	public Class447 method8911() {
		return this.aClass447_11;
	}

	@OriginalMember(owner = "client!im", name = "ew", descriptor = "()Lclient!oo;", line = 378)
	public Class447 method8912() {
		return this.aClass447_11;
	}

	@OriginalMember(owner = "client!im", name = "eu", descriptor = "()F", line = 382)
	public float method8913() {
		return this.aFloat105;
	}

	@OriginalMember(owner = "client!im", name = "af", descriptor = "(I)F", line = 382)
	public float method8914() {
		return this.aFloat105;
	}

	@OriginalMember(owner = "client!im", name = "ea", descriptor = "()F", line = 382)
	public float method8915() {
		return this.aFloat105;
	}

	@OriginalMember(owner = "client!im", name = "ec", descriptor = "()Lclient!oo;", line = 386)
	public Class447 method8916() {
		return this.aClass447_10;
	}

	@OriginalMember(owner = "client!im", name = "an", descriptor = "(I)Lclient!oo;", line = 386)
	public Class447 method8917() {
		return this.aClass447_10;
	}

	@OriginalMember(owner = "client!im", name = "ab", descriptor = "(I)Lclient!oo;", line = 390)
	public Class447 method8918() {
		return this.aClass447_12;
	}

	@OriginalMember(owner = "client!im", name = "eg", descriptor = "()Lclient!oo;", line = 390)
	public Class447 method8919() {
		return this.aClass447_12;
	}

	@OriginalMember(owner = "client!im", name = "el", descriptor = "()Lclient!oo;", line = 390)
	public Class447 method8920() {
		return this.aClass447_12;
	}

	@OriginalMember(owner = "client!im", name = "ey", descriptor = "()Lclient!oo;", line = 390)
	public Class447 method8921() {
		return this.aClass447_12;
	}

	@OriginalMember(owner = "client!im", name = "aa", descriptor = "(I)F", line = 394)
	public float method8922() {
		return this.aFloat114;
	}

	@OriginalMember(owner = "client!im", name = "eb", descriptor = "()F", line = 394)
	public float method8923() {
		return this.aFloat114;
	}

	@OriginalMember(owner = "client!im", name = "ap", descriptor = "(I)F", line = 398)
	public float method8924() {
		return this.aFloat103;
	}

	@OriginalMember(owner = "client!im", name = "aw", descriptor = "(B)F", line = 402)
	public float method8925() {
		return this.aFloat104;
	}

	@OriginalMember(owner = "client!im", name = "az", descriptor = "(I)Z", line = 406)
	public boolean method8926() {
		return this.aBoolean191;
	}

	@OriginalMember(owner = "client!im", name = "ez", descriptor = "()Z", line = 406)
	public boolean method8927() {
		return this.aBoolean191;
	}

	@OriginalMember(owner = "client!im", name = "ev", descriptor = "()Z", line = 406)
	public boolean method8928() {
		return this.aBoolean191;
	}

	@OriginalMember(owner = "client!im", name = "bc", descriptor = "(B)Z", line = 410)
	public boolean method8929() {
		return this.aBoolean192;
	}

	@OriginalMember(owner = "client!im", name = "ek", descriptor = "()Z", line = 410)
	public boolean method8930() {
		return this.aBoolean192;
	}

	@OriginalMember(owner = "client!im", name = "fv", descriptor = "()Z", line = 410)
	public boolean method8931() {
		return this.aBoolean192;
	}

	@OriginalMember(owner = "client!im", name = "fq", descriptor = "()Z", line = 410)
	public boolean method8932() {
		return this.aBoolean192;
	}

	@OriginalMember(owner = "client!im", name = "wx", descriptor = "(Lclient!yf;B)V", line = 8592)
	static final void method8933(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class60.aClass138_1.method14225();
	}
}
