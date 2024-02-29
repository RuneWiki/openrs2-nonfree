package com.jagex;

import java.io.EOFException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aes")
public final class Class93_Sub1 extends Class93 {

	@OriginalMember(owner = "client!aes", name = "c", descriptor = "I")
	static final int anInt732 = 1;

	@OriginalMember(owner = "client!aes", name = "q", descriptor = "[Lclient!oe;")
	Class438[] aClass438Array1;

	@OriginalMember(owner = "client!aes", name = "v", descriptor = "Z")
	public boolean aBoolean149 = false;

	@OriginalMember(owner = "client!aes", name = "l", descriptor = "J")
	public long aLong26 = -3766959635688985561L;

	@OriginalMember(owner = "client!aes", name = "y", descriptor = "Z")
	boolean aBoolean150 = false;

	@OriginalMember(owner = "client!aes", name = "t", descriptor = "J")
	long aLong27 = 894520806653522477L;

	@OriginalMember(owner = "client!aes", name = "x", descriptor = "I")
	int anInt733 = 0;

	@OriginalMember(owner = "client!aes", name = "d", descriptor = "[Lclient!pf;")
	final Class462[] aClass462Array1;

	@OriginalMember(owner = "client!aes", name = "w", descriptor = "Ljava/util/Set;")
	Set aSet1;

	@OriginalMember(owner = "client!aes", name = "<init>", descriptor = "(Lclient!adw;)V", line = 28)
	public Class93_Sub1(@OriginalArg(0) Class80_Sub1 arg0) {
		super(arg0);
		this.aClass462Array1 = new Class462[arg0.method18318()];
		for (@Pc(25) int local25 = 0; local25 < arg0.method18318(); local25++) {
			this.aClass462Array1[local25] = ((Class75) arg0.method18319(local25)).aClass462_3;
		}
		this.aSet1 = new HashSet(arg0.method18318());
	}

	@OriginalMember(owner = "client!aes", name = "t", descriptor = "(Lclient!ci;I)V", line = 37)
	@Override
	public void method35947(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass462Array1[arg0.anInt223 * -1270946121] == Class462.aClass462_4) {
			this.aBoolean149 = true;
		} else if (this.aClass462Array1[arg0.anInt223 * -1270946121] == Class462.aClass462_5 && this.method35934(arg0) != arg1) {
			this.aBoolean150 = true;
			this.aSet1.add(arg0.anInt223 * -1270946121);
		}
		super.method35943(arg0, arg1);
	}

	@OriginalMember(owner = "client!aes", name = "d", descriptor = "(Lclient!ci;I)V", line = 37)
	@Override
	public void method35951(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass462Array1[arg0.anInt223 * -1270946121] == Class462.aClass462_4) {
			this.aBoolean149 = true;
		} else if (this.aClass462Array1[arg0.anInt223 * -1270946121] == Class462.aClass462_5 && this.method35934(arg0) != arg1) {
			this.aBoolean150 = true;
			this.aSet1.add(arg0.anInt223 * -1270946121);
		}
		super.method35943(arg0, arg1);
	}

	@OriginalMember(owner = "client!aes", name = "p", descriptor = "(Lclient!ci;II)V", line = 37)
	@Override
	public void method35943(@OriginalArg(0) Class75 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass462Array1[arg0.anInt223 * -1270946121] == Class462.aClass462_4) {
			this.aBoolean149 = true;
		} else if (this.aClass462Array1[arg0.anInt223 * -1270946121] == Class462.aClass462_5 && this.method35934(arg0) != arg1) {
			this.aBoolean150 = true;
			this.aSet1.add(arg0.anInt223 * -1270946121);
		}
		super.method35943(arg0, arg1);
	}

	@OriginalMember(owner = "client!aes", name = "v", descriptor = "(Lclient!ci;J)V", line = 46)
	@Override
	public void method35945(@OriginalArg(0) Class75 arg0, @OriginalArg(1) long arg1) {
		if (this.aClass462Array1[arg0.anInt223 * -1270946121] == Class462.aClass462_4) {
			this.aBoolean149 = true;
		} else if (this.aClass462Array1[arg0.anInt223 * -1270946121] == Class462.aClass462_5 && this.method35950(arg0) != arg1) {
			this.aBoolean150 = true;
			this.aSet1.add(arg0.anInt223 * -1270946121);
		}
		super.method35945(arg0, arg1);
	}

	@OriginalMember(owner = "client!aes", name = "j", descriptor = "(Lclient!ci;J)V", line = 46)
	@Override
	public void method35944(@OriginalArg(0) Class75 arg0, @OriginalArg(1) long arg1) {
		if (this.aClass462Array1[arg0.anInt223 * -1270946121] == Class462.aClass462_4) {
			this.aBoolean149 = true;
		} else if (this.aClass462Array1[arg0.anInt223 * -1270946121] == Class462.aClass462_5 && this.method35950(arg0) != arg1) {
			this.aBoolean150 = true;
			this.aSet1.add(arg0.anInt223 * -1270946121);
		}
		super.method35945(arg0, arg1);
	}

	@OriginalMember(owner = "client!aes", name = "i", descriptor = "(Lclient!ci;J)V", line = 46)
	@Override
	public void method35942(@OriginalArg(0) Class75 arg0, @OriginalArg(1) long arg1) {
		if (this.aClass462Array1[arg0.anInt223 * -1270946121] == Class462.aClass462_4) {
			this.aBoolean149 = true;
		} else if (this.aClass462Array1[arg0.anInt223 * -1270946121] == Class462.aClass462_5 && this.method35950(arg0) != arg1) {
			this.aBoolean150 = true;
			this.aSet1.add(arg0.anInt223 * -1270946121);
		}
		super.method35945(arg0, arg1);
	}

	@OriginalMember(owner = "client!aes", name = "k", descriptor = "(Lclient!ci;J)V", line = 46)
	@Override
	public void method35953(@OriginalArg(0) Class75 arg0, @OriginalArg(1) long arg1) {
		if (this.aClass462Array1[arg0.anInt223 * -1270946121] == Class462.aClass462_4) {
			this.aBoolean149 = true;
		} else if (this.aClass462Array1[arg0.anInt223 * -1270946121] == Class462.aClass462_5 && this.method35950(arg0) != arg1) {
			this.aBoolean150 = true;
			this.aSet1.add(arg0.anInt223 * -1270946121);
		}
		super.method35945(arg0, arg1);
	}

	@OriginalMember(owner = "client!aes", name = "y", descriptor = "(Lclient!ci;Ljava/lang/Object;B)V", line = 55)
	@Override
	public void method35946(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Object arg1) {
		if (Class462.aClass462_4 == this.aClass462Array1[arg0.anInt223 * -1270946121]) {
			this.aBoolean149 = true;
		} else if (this.aClass462Array1[arg0.anInt223 * -1270946121] == Class462.aClass462_5) {
			if (arg1 instanceof String) {
				@Pc(27) String local27 = (String) arg1;
				if (local27.length() > 80) {
					arg1 = local27.substring(0, 80);
				}
			}
			@Pc(41) Object local41 = this.method35949(arg0);
			if (arg1 != null && local41 != null && !arg1.equals(local41)) {
				this.aBoolean150 = true;
				this.aSet1.add(arg0.anInt223 * -1270946121);
			} else if ((arg1 == null) != (local41 == null)) {
				this.aBoolean150 = true;
				this.aSet1.add(arg0.anInt223 * -1270946121);
			}
		}
		super.method35946(arg0, arg1);
	}

	@OriginalMember(owner = "client!aes", name = "f", descriptor = "(Lclient!ci;Ljava/lang/Object;)V", line = 55)
	@Override
	public void method35959(@OriginalArg(0) Class75 arg0, @OriginalArg(1) Object arg1) {
		if (Class462.aClass462_4 == this.aClass462Array1[arg0.anInt223 * -1270946121]) {
			this.aBoolean149 = true;
		} else if (this.aClass462Array1[arg0.anInt223 * -1270946121] == Class462.aClass462_5) {
			if (arg1 instanceof String) {
				@Pc(27) String local27 = (String) arg1;
				if (local27.length() > 80) {
					arg1 = local27.substring(0, 80);
				}
			}
			@Pc(41) Object local41 = this.method35949(arg0);
			if (arg1 != null && local41 != null && !arg1.equals(local41)) {
				this.aBoolean150 = true;
				this.aSet1.add(arg0.anInt223 * -1270946121);
			} else if ((arg1 == null) != (local41 == null)) {
				this.aBoolean150 = true;
				this.aSet1.add(arg0.anInt223 * -1270946121);
			}
		}
		super.method35946(arg0, arg1);
	}

	@OriginalMember(owner = "client!aes", name = "n", descriptor = "(B)V", line = 75)
	public void method6427() {
		for (@Pc(1) int local1 = 0; local1 < this.aClass462Array1.length; local1++) {
			if (this.aClass462Array1[local1] == Class462.aClass462_6 || this.aClass462Array1[local1] == Class462.aClass462_5) {
				this.anInterface3_2.method130(local1);
			}
		}
		this.aSet1.clear();
		this.aBoolean150 = false;
		this.aClass438Array1 = null;
		this.aLong27 = 894520806653522477L;
	}

	@OriginalMember(owner = "client!aes", name = "al", descriptor = "(B)V", line = 85)
	public void method6428() {
		this.anInt733 = 0;
	}

	@OriginalMember(owner = "client!aes", name = "ar", descriptor = "()V", line = 85)
	public void method6429() {
		this.anInt733 = 0;
	}

	@OriginalMember(owner = "client!aes", name = "ad", descriptor = "()V", line = 85)
	public void method6430() {
		this.anInt733 = 0;
	}

	@OriginalMember(owner = "client!aes", name = "av", descriptor = "(Lclient!abb;)V", line = 90)
	public void method6431(@OriginalArg(0) Class28 arg0) {
		try {
			@Pc(5) byte[] local5 = new byte[(int) arg0.method478()];
			@Pc(21) int local21;
			for (@Pc(7) int local7 = 0; local7 < local5.length; local7 += local21) {
				local21 = arg0.method486(local5, local7, local5.length - local7);
				if (local21 == -1) {
					throw new EOFException();
				}
			}
			@Pc(38) Class77_Sub39 local38 = new Class77_Sub39(local5);
			if (local38.aByteArray53.length - local38.anInt3089 * 31645619 >= 1) {
				@Pc(58) int local58 = local38.method22478();
				if (local58 < 0 || local58 > 1) {
					return;
				}
				if (local38.aByteArray53.length - local38.anInt3089 * 31645619 < 2) {
					return;
				}
				@Pc(89) int local89 = local38.method22483();
				if (local38.aByteArray53.length - local38.anInt3089 * 31645619 < local89 * 6) {
					return;
				}
				for (@Pc(109) int local109 = 0; local109 < local89; local109++) {
					@Pc(117) Class438 local117 = Class416.aClass80_Sub1_Sub2_4.method1949(local38);
					if (this.aClass462Array1[local117.anInt4927 * -608978823] == Class462.aClass462_4 && ((Class75) Class416.aClass80_Sub1_Sub2_4.method18319(local117.anInt4927 * -608978823)).aClass498_6.method30191().aClass2.isAssignableFrom(local117.anObject19.getClass())) {
						this.anInterface3_2.method128(local117.anInt4927 * -608978823, local117.anObject19);
					}
				}
				return;
			}
		} catch (@Pc(164) Exception local164) {
			return;
		} finally {
			try {
				arg0.method476();
			} catch (@Pc(176) Exception local176) {
			}
		}
	}

	@OriginalMember(owner = "client!aes", name = "ao", descriptor = "(Lclient!abb;B)V", line = 90)
	public void method6432(@OriginalArg(0) Class28 arg0) {
		try {
			@Pc(5) byte[] local5 = new byte[(int) arg0.method478()];
			@Pc(21) int local21;
			for (@Pc(7) int local7 = 0; local7 < local5.length; local7 += local21) {
				local21 = arg0.method486(local5, local7, local5.length - local7);
				if (local21 == -1) {
					throw new EOFException();
				}
			}
			@Pc(38) Class77_Sub39 local38 = new Class77_Sub39(local5);
			if (local38.aByteArray53.length - local38.anInt3089 * 31645619 < 1) {
				return;
			}
			@Pc(58) int local58 = local38.method22478();
			if (local58 < 0 || local58 > 1) {
				return;
			}
			if (local38.aByteArray53.length - local38.anInt3089 * 31645619 < 2) {
				return;
			}
			@Pc(89) int local89 = local38.method22483();
			if (local38.aByteArray53.length - local38.anInt3089 * 31645619 >= local89 * 6) {
				for (@Pc(109) int local109 = 0; local109 < local89; local109++) {
					@Pc(117) Class438 local117 = Class416.aClass80_Sub1_Sub2_4.method1949(local38);
					if (this.aClass462Array1[local117.anInt4927 * -608978823] == Class462.aClass462_4 && ((Class75) Class416.aClass80_Sub1_Sub2_4.method18319(local117.anInt4927 * -608978823)).aClass498_6.method30191().aClass2.isAssignableFrom(local117.anObject19.getClass())) {
						this.anInterface3_2.method128(local117.anInt4927 * -608978823, local117.anObject19);
					}
				}
				return;
			}
		} catch (@Pc(164) Exception local164) {
			return;
		} finally {
			try {
				arg0.method476();
			} catch (@Pc(176) Exception local176) {
			}
		}
	}

	@OriginalMember(owner = "client!aes", name = "ac", descriptor = "(Lclient!abb;)V", line = 90)
	public void method6433(@OriginalArg(0) Class28 arg0) {
		try {
			@Pc(5) byte[] local5 = new byte[(int) arg0.method478()];
			@Pc(21) int local21;
			for (@Pc(7) int local7 = 0; local7 < local5.length; local7 += local21) {
				local21 = arg0.method486(local5, local7, local5.length - local7);
				if (local21 == -1) {
					throw new EOFException();
				}
			}
			@Pc(38) Class77_Sub39 local38 = new Class77_Sub39(local5);
			if (local38.aByteArray53.length - local38.anInt3089 * 31645619 < 1) {
				return;
			}
			@Pc(58) int local58 = local38.method22478();
			if (local58 < 0 || local58 > 1) {
				return;
			}
			if (local38.aByteArray53.length - local38.anInt3089 * 31645619 >= 2) {
				@Pc(89) int local89 = local38.method22483();
				if (local38.aByteArray53.length - local38.anInt3089 * 31645619 < local89 * 6) {
					return;
				}
				for (@Pc(109) int local109 = 0; local109 < local89; local109++) {
					@Pc(117) Class438 local117 = Class416.aClass80_Sub1_Sub2_4.method1949(local38);
					if (this.aClass462Array1[local117.anInt4927 * -608978823] == Class462.aClass462_4 && ((Class75) Class416.aClass80_Sub1_Sub2_4.method18319(local117.anInt4927 * -608978823)).aClass498_6.method30191().aClass2.isAssignableFrom(local117.anObject19.getClass())) {
						this.anInterface3_2.method128(local117.anInt4927 * -608978823, local117.anObject19);
					}
				}
				return;
			}
		} catch (@Pc(164) Exception local164) {
			return;
		} finally {
			try {
				arg0.method476();
			} catch (@Pc(176) Exception local176) {
			}
		}
	}

	@OriginalMember(owner = "client!aes", name = "at", descriptor = "(Lclient!abb;)V", line = 90)
	public void method6434(@OriginalArg(0) Class28 arg0) {
		try {
			@Pc(5) byte[] local5 = new byte[(int) arg0.method478()];
			@Pc(21) int local21;
			for (@Pc(7) int local7 = 0; local7 < local5.length; local7 += local21) {
				local21 = arg0.method486(local5, local7, local5.length - local7);
				if (local21 == -1) {
					throw new EOFException();
				}
			}
			@Pc(38) Class77_Sub39 local38 = new Class77_Sub39(local5);
			if (local38.aByteArray53.length - local38.anInt3089 * 31645619 < 1) {
				return;
			}
			@Pc(58) int local58 = local38.method22478();
			if (local58 < 0 || local58 > 1) {
				return;
			}
			if (local38.aByteArray53.length - local38.anInt3089 * 31645619 < 2) {
				return;
			}
			@Pc(89) int local89 = local38.method22483();
			if (local38.aByteArray53.length - local38.anInt3089 * 31645619 < local89 * 6) {
				return;
			}
			for (@Pc(109) int local109 = 0; local109 < local89; local109++) {
				@Pc(117) Class438 local117 = Class416.aClass80_Sub1_Sub2_4.method1949(local38);
				if (this.aClass462Array1[local117.anInt4927 * -608978823] == Class462.aClass462_4 && ((Class75) Class416.aClass80_Sub1_Sub2_4.method18319(local117.anInt4927 * -608978823)).aClass498_6.method30191().aClass2.isAssignableFrom(local117.anObject19.getClass())) {
					this.anInterface3_2.method128(local117.anInt4927 * -608978823, local117.anObject19);
				}
			}
		} catch (@Pc(164) Exception local164) {
		} finally {
			try {
				arg0.method476();
			} catch (@Pc(176) Exception local176) {
			}
		}
	}

	@OriginalMember(owner = "client!aes", name = "ak", descriptor = "(Lclient!abb;I)V", line = 124)
	public void method6435(@OriginalArg(0) Class28 arg0) {
		try {
			@Pc(1) int local1 = 3;
			@Pc(3) int local3 = 0;
			@Pc(7) Iterator local7 = this.anInterface3_2.iterator();
			while (local7.hasNext()) {
				@Pc(14) Class438 local14 = (Class438) local7.next();
				if (this.aClass462Array1[local14.anInt4927 * -608978823] == Class462.aClass462_4) {
					local1 += Class416.aClass80_Sub1_Sub2_4.method1946(local14);
					local3++;
				}
			}
			@Pc(37) Class77_Sub39 local37 = new Class77_Sub39(local1);
			local37.method22403(1);
			local37.method22408(local3);
			@Pc(49) Iterator local49 = this.anInterface3_2.iterator();
			while (local49.hasNext()) {
				@Pc(56) Class438 local56 = (Class438) local49.next();
				if (this.aClass462Array1[local56.anInt4927 * -608978823] == Class462.aClass462_4) {
					Class416.aClass80_Sub1_Sub2_4.method1948(local37, local56);
				}
			}
			arg0.method475(local37.aByteArray53, 0, local37.anInt3089 * 31645619);
		} catch (@Pc(88) Exception local88) {
		} finally {
			try {
				arg0.method476();
			} catch (@Pc(100) Exception local100) {
			}
		}
		this.aLong26 = Class280.method26667() * 3766959635688985561L;
		this.aBoolean149 = false;
	}

	@OriginalMember(owner = "client!aes", name = "v", descriptor = "(I)V", line = 137)
	public static void method6436() {
		Class230.aClass12_24.method188();
		Class230.aClass695_49.method36380();
		Class230.aClass233Array1 = null;
		Class589.aClass222Array1 = null;
		Class128_Sub1.aClass225Array1 = null;
		Class372.aClass237Array1 = null;
		Class695.aClass96Array1 = null;
		Class230.anInt3761 = -213444879;
		Class230.anInt3758 = 0;
		Class230.anInt3757 = 0;
		Class661.aClass231_4 = null;
		Class230.anInt3759 = -2070289217;
		Class230.anInt3760 = -683420367;
		if (!Class230.aBoolean645) {
			return;
		}
		client.aShort160 = Class240.aShort166;
		client.aShort161 = Class85.aShort12;
		client.aShort158 = Class96_Sub10.aShort24;
		client.aShort159 = Class230.aShort165;
		Class230.aBoolean645 = false;
	}

	@OriginalMember(owner = "client!aes", name = "au", descriptor = "(B)V", line = 158)
	public void method6437() {
		if (Class280.method26667() < this.aLong27 * 1272730396758921819L) {
			return;
		}
		@Pc(36) int local36;
		if (this.aClass438Array1 == null) {
			if (!this.aBoolean150) {
				return;
			}
			this.aClass438Array1 = new Class438[this.aSet1.size()];
			@Pc(24) int local24 = 0;
			@Pc(28) Iterator local28 = this.aSet1.iterator();
			while (local28.hasNext()) {
				local36 = (Integer) local28.next();
				this.aClass438Array1[local24++] = new Class438(local36, this.anInterface3_2.method144(local36));
			}
			this.anInt733 = 0;
			this.aBoolean150 = false;
			this.aSet1.clear();
		}
		if (this.aClass438Array1 == null || this.anInt733 * 375813299 >= this.aClass438Array1.length) {
			return;
		}
		@Pc(74) Class82 local74 = Class230.method25826();
		if (local74.anInt320 * 1030372175 > 1200) {
			return;
		}
		@Pc(87) Class77_Sub20 local87 = Class365.method28132(Class414.aClass414_32, local74.aClass16_1);
		local87.aClass77_Sub39_Sub1_2.method22408(0);
		local36 = local87.aClass77_Sub39_Sub1_2.anInt3089 * 31645619;
		local87.aClass77_Sub39_Sub1_2.anInt3089 += -1387468933;
		while (this.anInt733 * 375813299 < this.aClass438Array1.length) {
			@Pc(121) Class438 local121 = this.aClass438Array1[this.anInt733 * 375813299];
			if (local74.anInt320 * 1030372175 + local87.aClass77_Sub39_Sub1_2.anInt3089 * 31645619 + Class416.aClass80_Sub1_Sub2_4.method1946(local121) > 1500) {
				break;
			}
			Class416.aClass80_Sub1_Sub2_4.method1948(local87.aClass77_Sub39_Sub1_2, local121);
			this.anInt733 += -289056133;
		}
		local87.aClass77_Sub39_Sub1_2.method22462(local87.aClass77_Sub39_Sub1_2.anInt3089 * 31645619 - local36);
		if (this.anInt733 * 375813299 >= this.aClass438Array1.length) {
			local87.aClass77_Sub39_Sub1_2.aByteArray53[local36] = 1;
		} else {
			local87.aClass77_Sub39_Sub1_2.aByteArray53[local36] = 0;
		}
		local74.method2004(local87);
		this.aLong27 = (Class280.method26667() + 1000L) * -894520806653522477L;
	}

	@OriginalMember(owner = "client!aes", name = "ae", descriptor = "()V", line = 158)
	public void method6438() {
		if (Class280.method26667() < this.aLong27 * 1272730396758921819L) {
			return;
		}
		@Pc(36) int local36;
		if (this.aClass438Array1 == null) {
			if (!this.aBoolean150) {
				return;
			}
			this.aClass438Array1 = new Class438[this.aSet1.size()];
			@Pc(24) int local24 = 0;
			@Pc(28) Iterator local28 = this.aSet1.iterator();
			while (local28.hasNext()) {
				local36 = (Integer) local28.next();
				this.aClass438Array1[local24++] = new Class438(local36, this.anInterface3_2.method144(local36));
			}
			this.anInt733 = 0;
			this.aBoolean150 = false;
			this.aSet1.clear();
		}
		if (this.aClass438Array1 == null || this.anInt733 * 375813299 >= this.aClass438Array1.length) {
			return;
		}
		@Pc(74) Class82 local74 = Class230.method25826();
		if (local74.anInt320 * 1030372175 > 1200) {
			return;
		}
		@Pc(87) Class77_Sub20 local87 = Class365.method28132(Class414.aClass414_32, local74.aClass16_1);
		local87.aClass77_Sub39_Sub1_2.method22408(0);
		local36 = local87.aClass77_Sub39_Sub1_2.anInt3089 * 31645619;
		local87.aClass77_Sub39_Sub1_2.anInt3089 += -1387468933;
		while (this.anInt733 * 375813299 < this.aClass438Array1.length) {
			@Pc(121) Class438 local121 = this.aClass438Array1[this.anInt733 * 375813299];
			if (local74.anInt320 * 1030372175 + local87.aClass77_Sub39_Sub1_2.anInt3089 * 31645619 + Class416.aClass80_Sub1_Sub2_4.method1946(local121) > 1500) {
				break;
			}
			Class416.aClass80_Sub1_Sub2_4.method1948(local87.aClass77_Sub39_Sub1_2, local121);
			this.anInt733 += -289056133;
		}
		local87.aClass77_Sub39_Sub1_2.method22462(local87.aClass77_Sub39_Sub1_2.anInt3089 * 31645619 - local36);
		if (this.anInt733 * 375813299 >= this.aClass438Array1.length) {
			local87.aClass77_Sub39_Sub1_2.aByteArray53[local36] = 1;
		} else {
			local87.aClass77_Sub39_Sub1_2.aByteArray53[local36] = 0;
		}
		local74.method2004(local87);
		this.aLong27 = (Class280.method26667() + 1000L) * -894520806653522477L;
	}

	@OriginalMember(owner = "client!aes", name = "ah", descriptor = "()V", line = 158)
	public void method6439() {
		if (Class280.method26667() < this.aLong27 * 1272730396758921819L) {
			return;
		}
		@Pc(36) int local36;
		if (this.aClass438Array1 == null) {
			if (!this.aBoolean150) {
				return;
			}
			this.aClass438Array1 = new Class438[this.aSet1.size()];
			@Pc(24) int local24 = 0;
			@Pc(28) Iterator local28 = this.aSet1.iterator();
			while (local28.hasNext()) {
				local36 = (Integer) local28.next();
				this.aClass438Array1[local24++] = new Class438(local36, this.anInterface3_2.method144(local36));
			}
			this.anInt733 = 0;
			this.aBoolean150 = false;
			this.aSet1.clear();
		}
		if (this.aClass438Array1 == null || this.anInt733 * 375813299 >= this.aClass438Array1.length) {
			return;
		}
		@Pc(74) Class82 local74 = Class230.method25826();
		if (local74.anInt320 * 1030372175 > 1200) {
			return;
		}
		@Pc(87) Class77_Sub20 local87 = Class365.method28132(Class414.aClass414_32, local74.aClass16_1);
		local87.aClass77_Sub39_Sub1_2.method22408(0);
		local36 = local87.aClass77_Sub39_Sub1_2.anInt3089 * 31645619;
		local87.aClass77_Sub39_Sub1_2.anInt3089 += -1387468933;
		while (this.anInt733 * 375813299 < this.aClass438Array1.length) {
			@Pc(121) Class438 local121 = this.aClass438Array1[this.anInt733 * 375813299];
			if (local74.anInt320 * 1030372175 + local87.aClass77_Sub39_Sub1_2.anInt3089 * 31645619 + Class416.aClass80_Sub1_Sub2_4.method1946(local121) > 1500) {
				break;
			}
			Class416.aClass80_Sub1_Sub2_4.method1948(local87.aClass77_Sub39_Sub1_2, local121);
			this.anInt733 += -289056133;
		}
		local87.aClass77_Sub39_Sub1_2.method22462(local87.aClass77_Sub39_Sub1_2.anInt3089 * 31645619 - local36);
		if (this.anInt733 * 375813299 >= this.aClass438Array1.length) {
			local87.aClass77_Sub39_Sub1_2.aByteArray53[local36] = 1;
		} else {
			local87.aClass77_Sub39_Sub1_2.aByteArray53[local36] = 0;
		}
		local74.method2004(local87);
		this.aLong27 = (Class280.method26667() + 1000L) * -894520806653522477L;
	}

	@OriginalMember(owner = "client!aes", name = "as", descriptor = "()V", line = 195)
	public void method6440() {
		if (this.aClass438Array1 != null && this.anInt733 * 375813299 >= this.aClass438Array1.length) {
			this.aClass438Array1 = null;
			this.anInt733 = 0;
		}
	}

	@OriginalMember(owner = "client!aes", name = "ax", descriptor = "(B)V", line = 195)
	public void method6441() {
		if (this.aClass438Array1 != null && this.anInt733 * 375813299 >= this.aClass438Array1.length) {
			this.aClass438Array1 = null;
			this.anInt733 = 0;
		}
	}

	@OriginalMember(owner = "client!aes", name = "ade", descriptor = "(Lclient!yf;I)V", line = 9840)
	static final void method6442(@OriginalArg(0) Class665 arg0) {
		@Pc(16) boolean local16 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307] != 0;
		@Pc(29) int local29 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = Class102.method7917((long) local29, 0, local16, Class128.aClass667_3);
	}
}
