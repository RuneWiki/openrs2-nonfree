package com.jagex;

import java.io.EOFException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afu")
public final class Class113_Sub1 extends Class113 {

	@OriginalMember(owner = "client!afu", name = "n", descriptor = "I")
	static final int anInt864 = 1;

	@OriginalMember(owner = "client!afu", name = "jz", descriptor = "I")
	static int anInt866;

	@OriginalMember(owner = "client!afu", name = "u", descriptor = "[Lclient!on;")
	Class466[] aClass466Array1;

	@OriginalMember(owner = "client!afu", name = "m", descriptor = "Z")
	public boolean aBoolean171 = false;

	@OriginalMember(owner = "client!afu", name = "k", descriptor = "J")
	public long aLong26 = 2265688048181101683L;

	@OriginalMember(owner = "client!afu", name = "f", descriptor = "Z")
	boolean aBoolean172 = false;

	@OriginalMember(owner = "client!afu", name = "l", descriptor = "J")
	long aLong27 = 1570658587136822319L;

	@OriginalMember(owner = "client!afu", name = "z", descriptor = "I")
	int anInt865 = 0;

	@OriginalMember(owner = "client!afu", name = "p", descriptor = "[Lclient!qj;")
	final Class507[] aClass507Array1;

	@OriginalMember(owner = "client!afu", name = "w", descriptor = "Ljava/util/Set;")
	Set aSet1;

	@OriginalMember(owner = "client!afu", name = "<init>", descriptor = "(Lclient!add;)V", line = 28)
	public Class113_Sub1(@OriginalArg(0) Class79_Sub1 arg0) {
		super(arg0);
		this.aClass507Array1 = new Class507[arg0.method18262()];
		for (@Pc(25) int local25 = 0; local25 < arg0.method18262(); local25++) {
			this.aClass507Array1[local25] = ((Class108) arg0.method18261(local25)).aClass507_3;
		}
		this.aSet1 = new HashSet(arg0.method18262());
	}

	@OriginalMember(owner = "client!afu", name = "l", descriptor = "(Lclient!ec;I)V", line = 37)
	@Override
	public void method33470(@OriginalArg(0) Class108 arg0, @OriginalArg(1) int arg1) {
		if (Class507.aClass507_4 == this.aClass507Array1[arg0.anInt867 * -1284841473]) {
			this.aBoolean171 = true;
		} else if (Class507.aClass507_6 == this.aClass507Array1[arg0.anInt867 * -1284841473] && this.method33455(arg0) != arg1) {
			this.aBoolean172 = true;
			this.aSet1.add(arg0.anInt867 * -1284841473);
		}
		super.method33464(arg0, arg1);
	}

	@OriginalMember(owner = "client!afu", name = "e", descriptor = "(Lclient!ec;II)V", line = 37)
	@Override
	public void method33464(@OriginalArg(0) Class108 arg0, @OriginalArg(1) int arg1) {
		if (Class507.aClass507_4 == this.aClass507Array1[arg0.anInt867 * -1284841473]) {
			this.aBoolean171 = true;
		} else if (Class507.aClass507_6 == this.aClass507Array1[arg0.anInt867 * -1284841473] && this.method33455(arg0) != arg1) {
			this.aBoolean172 = true;
			this.aSet1.add(arg0.anInt867 * -1284841473);
		}
		super.method33464(arg0, arg1);
	}

	@OriginalMember(owner = "client!afu", name = "m", descriptor = "(Lclient!ec;J)V", line = 46)
	@Override
	public void method33466(@OriginalArg(0) Class108 arg0, @OriginalArg(1) long arg1) {
		if (this.aClass507Array1[arg0.anInt867 * -1284841473] == Class507.aClass507_4) {
			this.aBoolean171 = true;
		} else if (Class507.aClass507_6 == this.aClass507Array1[arg0.anInt867 * -1284841473] && this.method33465(arg0) != arg1) {
			this.aBoolean172 = true;
			this.aSet1.add(arg0.anInt867 * -1284841473);
		}
		super.method33466(arg0, arg1);
	}

	@OriginalMember(owner = "client!afu", name = "d", descriptor = "(Lclient!ec;J)V", line = 46)
	@Override
	public void method33474(@OriginalArg(0) Class108 arg0, @OriginalArg(1) long arg1) {
		if (this.aClass507Array1[arg0.anInt867 * -1284841473] == Class507.aClass507_4) {
			this.aBoolean171 = true;
		} else if (Class507.aClass507_6 == this.aClass507Array1[arg0.anInt867 * -1284841473] && this.method33465(arg0) != arg1) {
			this.aBoolean172 = true;
			this.aSet1.add(arg0.anInt867 * -1284841473);
		}
		super.method33466(arg0, arg1);
	}

	@OriginalMember(owner = "client!afu", name = "c", descriptor = "(Lclient!ec;J)V", line = 46)
	@Override
	public void method33475(@OriginalArg(0) Class108 arg0, @OriginalArg(1) long arg1) {
		if (this.aClass507Array1[arg0.anInt867 * -1284841473] == Class507.aClass507_4) {
			this.aBoolean171 = true;
		} else if (Class507.aClass507_6 == this.aClass507Array1[arg0.anInt867 * -1284841473] && this.method33465(arg0) != arg1) {
			this.aBoolean172 = true;
			this.aSet1.add(arg0.anInt867 * -1284841473);
		}
		super.method33466(arg0, arg1);
	}

	@OriginalMember(owner = "client!afu", name = "f", descriptor = "(Lclient!ec;Ljava/lang/Object;I)V", line = 55)
	@Override
	public void method33468(@OriginalArg(0) Class108 arg0, @OriginalArg(1) Object arg1) {
		if (Class507.aClass507_4 == this.aClass507Array1[arg0.anInt867 * -1284841473]) {
			this.aBoolean171 = true;
		} else if (Class507.aClass507_6 == this.aClass507Array1[arg0.anInt867 * -1284841473]) {
			if (arg1 instanceof String) {
				@Pc(27) String local27 = (String) arg1;
				if (local27.length() > 80) {
					arg1 = local27.substring(0, 80);
				}
			}
			@Pc(41) Object local41 = this.method33467(arg0);
			if (arg1 != null && local41 != null && !arg1.equals(local41)) {
				this.aBoolean172 = true;
				this.aSet1.add(arg0.anInt867 * -1284841473);
			} else if ((local41 == null) != (arg1 == null)) {
				this.aBoolean172 = true;
				this.aSet1.add(arg0.anInt867 * -1284841473);
			}
		}
		super.method33468(arg0, arg1);
	}

	@OriginalMember(owner = "client!afu", name = "r", descriptor = "(Lclient!ec;Ljava/lang/Object;)V", line = 55)
	@Override
	public void method33476(@OriginalArg(0) Class108 arg0, @OriginalArg(1) Object arg1) {
		if (Class507.aClass507_4 == this.aClass507Array1[arg0.anInt867 * -1284841473]) {
			this.aBoolean171 = true;
		} else if (Class507.aClass507_6 == this.aClass507Array1[arg0.anInt867 * -1284841473]) {
			if (arg1 instanceof String) {
				@Pc(27) String local27 = (String) arg1;
				if (local27.length() > 80) {
					arg1 = local27.substring(0, 80);
				}
			}
			@Pc(41) Object local41 = this.method33467(arg0);
			if (arg1 != null && local41 != null && !arg1.equals(local41)) {
				this.aBoolean172 = true;
				this.aSet1.add(arg0.anInt867 * -1284841473);
			} else if ((local41 == null) != (arg1 == null)) {
				this.aBoolean172 = true;
				this.aSet1.add(arg0.anInt867 * -1284841473);
			}
		}
		super.method33468(arg0, arg1);
	}

	@OriginalMember(owner = "client!afu", name = "v", descriptor = "(Lclient!ec;Ljava/lang/Object;)V", line = 55)
	@Override
	public void method33477(@OriginalArg(0) Class108 arg0, @OriginalArg(1) Object arg1) {
		if (Class507.aClass507_4 == this.aClass507Array1[arg0.anInt867 * -1284841473]) {
			this.aBoolean171 = true;
		} else if (Class507.aClass507_6 == this.aClass507Array1[arg0.anInt867 * -1284841473]) {
			if (arg1 instanceof String) {
				@Pc(27) String local27 = (String) arg1;
				if (local27.length() > 80) {
					arg1 = local27.substring(0, 80);
				}
			}
			@Pc(41) Object local41 = this.method33467(arg0);
			if (arg1 != null && local41 != null && !arg1.equals(local41)) {
				this.aBoolean172 = true;
				this.aSet1.add(arg0.anInt867 * -1284841473);
			} else if ((local41 == null) != (arg1 == null)) {
				this.aBoolean172 = true;
				this.aSet1.add(arg0.anInt867 * -1284841473);
			}
		}
		super.method33468(arg0, arg1);
	}

	@OriginalMember(owner = "client!afu", name = "o", descriptor = "(Lclient!ec;Ljava/lang/Object;)V", line = 55)
	@Override
	public void method33478(@OriginalArg(0) Class108 arg0, @OriginalArg(1) Object arg1) {
		if (Class507.aClass507_4 == this.aClass507Array1[arg0.anInt867 * -1284841473]) {
			this.aBoolean171 = true;
		} else if (Class507.aClass507_6 == this.aClass507Array1[arg0.anInt867 * -1284841473]) {
			if (arg1 instanceof String) {
				@Pc(27) String local27 = (String) arg1;
				if (local27.length() > 80) {
					arg1 = local27.substring(0, 80);
				}
			}
			@Pc(41) Object local41 = this.method33467(arg0);
			if (arg1 != null && local41 != null && !arg1.equals(local41)) {
				this.aBoolean172 = true;
				this.aSet1.add(arg0.anInt867 * -1284841473);
			} else if ((local41 == null) != (arg1 == null)) {
				this.aBoolean172 = true;
				this.aSet1.add(arg0.anInt867 * -1284841473);
			}
		}
		super.method33468(arg0, arg1);
	}

	@OriginalMember(owner = "client!afu", name = "s", descriptor = "(Lclient!ec;Ljava/lang/Object;)V", line = 55)
	@Override
	public void method33483(@OriginalArg(0) Class108 arg0, @OriginalArg(1) Object arg1) {
		if (Class507.aClass507_4 == this.aClass507Array1[arg0.anInt867 * -1284841473]) {
			this.aBoolean171 = true;
		} else if (Class507.aClass507_6 == this.aClass507Array1[arg0.anInt867 * -1284841473]) {
			if (arg1 instanceof String) {
				@Pc(27) String local27 = (String) arg1;
				if (local27.length() > 80) {
					arg1 = local27.substring(0, 80);
				}
			}
			@Pc(41) Object local41 = this.method33467(arg0);
			if (arg1 != null && local41 != null && !arg1.equals(local41)) {
				this.aBoolean172 = true;
				this.aSet1.add(arg0.anInt867 * -1284841473);
			} else if ((local41 == null) != (arg1 == null)) {
				this.aBoolean172 = true;
				this.aSet1.add(arg0.anInt867 * -1284841473);
			}
		}
		super.method33468(arg0, arg1);
	}

	@OriginalMember(owner = "client!afu", name = "i", descriptor = "(I)V", line = 75)
	public void method7414() {
		for (@Pc(1) int local1 = 0; local1 < this.aClass507Array1.length; local1++) {
			if (this.aClass507Array1[local1] == Class507.aClass507_5 || this.aClass507Array1[local1] == Class507.aClass507_6) {
				this.anInterface3_2.method778(local1);
			}
		}
		this.aSet1.clear();
		this.aBoolean172 = false;
		this.aClass466Array1 = null;
		this.aLong27 = 1570658587136822319L;
	}

	@OriginalMember(owner = "client!afu", name = "am", descriptor = "()V", line = 85)
	public void method7415() {
		this.anInt865 = 0;
	}

	@OriginalMember(owner = "client!afu", name = "j", descriptor = "(I)V", line = 85)
	public void method7420() {
		this.anInt865 = 0;
	}

	@OriginalMember(owner = "client!afu", name = "au", descriptor = "()V", line = 85)
	public void method7421() {
		this.anInt865 = 0;
	}

	@OriginalMember(owner = "client!afu", name = "ar", descriptor = "(Lclient!abl;)V", line = 90)
	public void method7418(@OriginalArg(0) Class38 arg0) {
		try {
			@Pc(5) byte[] local5 = new byte[(int) arg0.method735()];
			@Pc(21) int local21;
			for (@Pc(7) int local7 = 0; local7 < local5.length; local7 += local21) {
				local21 = arg0.method726(local5, local7, local5.length - local7);
				if (local21 == -1) {
					throw new EOFException();
				}
			}
			@Pc(38) Class93_Sub41 local38 = new Class93_Sub41(local5);
			if (local38.aByteArray58.length - local38.anInt3070 * 212851357 < 1) {
				return;
			}
			@Pc(58) int local58 = local38.method22413();
			if (local58 < 0 || local58 > 1) {
				return;
			}
			if (local38.aByteArray58.length - local38.anInt3070 * 212851357 >= 2) {
				@Pc(89) int local89 = local38.method22415();
				if (local38.aByteArray58.length - local38.anInt3070 * 212851357 < local89 * 6) {
					return;
				}
				for (@Pc(109) int local109 = 0; local109 < local89; local109++) {
					@Pc(117) Class466 local117 = Class72.aClass79_Sub1_Sub2_2.method1463(local38);
					if (this.aClass507Array1[local117.anInt5092 * -1181855333] == Class507.aClass507_4 && ((Class108) Class72.aClass79_Sub1_Sub2_2.method18261(local117.anInt5092 * -1181855333)).aClass519_6.method30311().aClass2.isAssignableFrom(local117.anObject19.getClass())) {
						this.anInterface3_2.method776(local117.anInt5092 * -1181855333, local117.anObject19);
					}
				}
				return;
			}
		} catch (@Pc(164) Exception local164) {
			return;
		} finally {
			try {
				arg0.method732();
			} catch (@Pc(176) Exception local176) {
			}
		}
	}

	@OriginalMember(owner = "client!afu", name = "t", descriptor = "(Lclient!abl;B)V", line = 90)
	public void method7419(@OriginalArg(0) Class38 arg0) {
		try {
			@Pc(5) byte[] local5 = new byte[(int) arg0.method735()];
			@Pc(21) int local21;
			for (@Pc(7) int local7 = 0; local7 < local5.length; local7 += local21) {
				local21 = arg0.method726(local5, local7, local5.length - local7);
				if (local21 == -1) {
					throw new EOFException();
				}
			}
			@Pc(38) Class93_Sub41 local38 = new Class93_Sub41(local5);
			if (local38.aByteArray58.length - local38.anInt3070 * 212851357 < 1) {
				return;
			}
			@Pc(58) int local58 = local38.method22413();
			if (local58 < 0 || local58 > 1) {
				return;
			}
			if (local38.aByteArray58.length - local38.anInt3070 * 212851357 < 2) {
				return;
			}
			@Pc(89) int local89 = local38.method22415();
			if (local38.aByteArray58.length - local38.anInt3070 * 212851357 >= local89 * 6) {
				for (@Pc(109) int local109 = 0; local109 < local89; local109++) {
					@Pc(117) Class466 local117 = Class72.aClass79_Sub1_Sub2_2.method1463(local38);
					if (this.aClass507Array1[local117.anInt5092 * -1181855333] == Class507.aClass507_4 && ((Class108) Class72.aClass79_Sub1_Sub2_2.method18261(local117.anInt5092 * -1181855333)).aClass519_6.method30311().aClass2.isAssignableFrom(local117.anObject19.getClass())) {
						this.anInterface3_2.method776(local117.anInt5092 * -1181855333, local117.anObject19);
					}
				}
				return;
			}
		} catch (@Pc(164) Exception local164) {
			return;
		} finally {
			try {
				arg0.method732();
			} catch (@Pc(176) Exception local176) {
			}
		}
	}

	@OriginalMember(owner = "client!afu", name = "u", descriptor = "(II)V", line = 115)
	public static void method7427(@OriginalArg(0) int arg0) {
		if (client.anInt3435 * -849002901 == 0) {
			@Pc(10) Class93_Sub22 local10 = Class102.method2592(Class446.aClass446_120, client.aClass175_1.aClass24_2);
			local10.aClass93_Sub41_Sub2_1.method22510(arg0);
			client.aClass175_1.method24351(local10);
		}
	}

	@OriginalMember(owner = "client!afu", name = "ae", descriptor = "(Lclient!abl;B)V", line = 124)
	public void method7417(@OriginalArg(0) Class38 arg0) {
		try {
			@Pc(1) int local1 = 3;
			@Pc(3) int local3 = 0;
			@Pc(7) Iterator local7 = this.anInterface3_2.iterator();
			while (local7.hasNext()) {
				@Pc(14) Class466 local14 = (Class466) local7.next();
				if (Class507.aClass507_4 == this.aClass507Array1[local14.anInt5092 * -1181855333]) {
					local1 += Class72.aClass79_Sub1_Sub2_2.method1461(local14);
					local3++;
				}
			}
			@Pc(37) Class93_Sub41 local37 = new Class93_Sub41(local1);
			local37.method22510(1);
			local37.method22454(local3);
			@Pc(49) Iterator local49 = this.anInterface3_2.iterator();
			while (local49.hasNext()) {
				@Pc(56) Class466 local56 = (Class466) local49.next();
				if (Class507.aClass507_4 == this.aClass507Array1[local56.anInt5092 * -1181855333]) {
					Class72.aClass79_Sub1_Sub2_2.method1462(local37, local56);
				}
			}
			arg0.method722(local37.aByteArray58, 0, local37.anInt3070 * 212851357);
		} catch (@Pc(88) Exception local88) {
		} finally {
			try {
				arg0.method732();
			} catch (@Pc(100) Exception local100) {
			}
		}
		this.aLong26 = Class305.method26796() * -2265688048181101683L;
		this.aBoolean171 = false;
	}

	@OriginalMember(owner = "client!afu", name = "ap", descriptor = "(Lclient!abl;)V", line = 124)
	public void method7422(@OriginalArg(0) Class38 arg0) {
		try {
			@Pc(1) int local1 = 3;
			@Pc(3) int local3 = 0;
			@Pc(7) Iterator local7 = this.anInterface3_2.iterator();
			while (local7.hasNext()) {
				@Pc(14) Class466 local14 = (Class466) local7.next();
				if (Class507.aClass507_4 == this.aClass507Array1[local14.anInt5092 * -1181855333]) {
					local1 += Class72.aClass79_Sub1_Sub2_2.method1461(local14);
					local3++;
				}
			}
			@Pc(37) Class93_Sub41 local37 = new Class93_Sub41(local1);
			local37.method22510(1);
			local37.method22454(local3);
			@Pc(49) Iterator local49 = this.anInterface3_2.iterator();
			while (local49.hasNext()) {
				@Pc(56) Class466 local56 = (Class466) local49.next();
				if (Class507.aClass507_4 == this.aClass507Array1[local56.anInt5092 * -1181855333]) {
					Class72.aClass79_Sub1_Sub2_2.method1462(local37, local56);
				}
			}
			arg0.method722(local37.aByteArray58, 0, local37.anInt3070 * 212851357);
		} catch (@Pc(88) Exception local88) {
		} finally {
			try {
				arg0.method732();
			} catch (@Pc(100) Exception local100) {
			}
		}
		this.aLong26 = Class305.method26796() * -2265688048181101683L;
		this.aBoolean171 = false;
	}

	@OriginalMember(owner = "client!afu", name = "aq", descriptor = "(Lclient!abl;)V", line = 124)
	public void method7423(@OriginalArg(0) Class38 arg0) {
		try {
			@Pc(1) int local1 = 3;
			@Pc(3) int local3 = 0;
			@Pc(7) Iterator local7 = this.anInterface3_2.iterator();
			while (local7.hasNext()) {
				@Pc(14) Class466 local14 = (Class466) local7.next();
				if (Class507.aClass507_4 == this.aClass507Array1[local14.anInt5092 * -1181855333]) {
					local1 += Class72.aClass79_Sub1_Sub2_2.method1461(local14);
					local3++;
				}
			}
			@Pc(37) Class93_Sub41 local37 = new Class93_Sub41(local1);
			local37.method22510(1);
			local37.method22454(local3);
			@Pc(49) Iterator local49 = this.anInterface3_2.iterator();
			while (local49.hasNext()) {
				@Pc(56) Class466 local56 = (Class466) local49.next();
				if (Class507.aClass507_4 == this.aClass507Array1[local56.anInt5092 * -1181855333]) {
					Class72.aClass79_Sub1_Sub2_2.method1462(local37, local56);
				}
			}
			arg0.method722(local37.aByteArray58, 0, local37.anInt3070 * 212851357);
		} catch (@Pc(88) Exception local88) {
		} finally {
			try {
				arg0.method732();
			} catch (@Pc(100) Exception local100) {
			}
		}
		this.aLong26 = Class305.method26796() * -2265688048181101683L;
		this.aBoolean171 = false;
	}

	@OriginalMember(owner = "client!afu", name = "ag", descriptor = "(I)V", line = 158)
	public void method7413() {
		if (Class305.method26796() < this.aLong27 * 1159186737028678961L) {
			return;
		}
		@Pc(35) int local35;
		if (this.aClass466Array1 == null) {
			if (!this.aBoolean172) {
				return;
			}
			this.aClass466Array1 = new Class466[this.aSet1.size()];
			@Pc(23) int local23 = 0;
			@Pc(27) Iterator local27 = this.aSet1.iterator();
			while (local27.hasNext()) {
				local35 = (Integer) local27.next();
				this.aClass466Array1[local23++] = new Class466(local35, this.anInterface3_2.method775(local35));
			}
			this.anInt865 = 0;
			this.aBoolean172 = false;
			this.aSet1.clear();
		}
		if (this.aClass466Array1 == null || this.anInt865 * -866505885 >= this.aClass466Array1.length) {
			return;
		}
		@Pc(73) Class175 local73 = Class330.method27372();
		if (local73.anInt3299 * 195575097 > 1200) {
			return;
		}
		@Pc(86) Class93_Sub22 local86 = Class102.method2592(Class446.aClass446_53, local73.aClass24_2);
		local86.aClass93_Sub41_Sub2_1.method22454(0);
		local35 = local86.aClass93_Sub41_Sub2_1.anInt3070 * 212851357;
		local86.aClass93_Sub41_Sub2_1.anInt3070 += -1445626955;
		while (this.anInt865 * -866505885 < this.aClass466Array1.length) {
			@Pc(120) Class466 local120 = this.aClass466Array1[this.anInt865 * -866505885];
			if (local86.aClass93_Sub41_Sub2_1.anInt3070 * 212851357 + local73.anInt3299 * 195575097 + Class72.aClass79_Sub1_Sub2_2.method1461(local120) > 1500) {
				break;
			}
			Class72.aClass79_Sub1_Sub2_2.method1462(local86.aClass93_Sub41_Sub2_1, local120);
			this.anInt865 += -1626821045;
		}
		local86.aClass93_Sub41_Sub2_1.method22407(local86.aClass93_Sub41_Sub2_1.anInt3070 * 212851357 - local35);
		if (this.anInt865 * -866505885 >= this.aClass466Array1.length) {
			local86.aClass93_Sub41_Sub2_1.aByteArray58[local35] = 1;
		} else {
			local86.aClass93_Sub41_Sub2_1.aByteArray58[local35] = 0;
		}
		local73.method24351(local86);
		this.aLong27 = (Class305.method26796() + 1000L) * -1570658587136822319L;
	}

	@OriginalMember(owner = "client!afu", name = "ao", descriptor = "()V", line = 158)
	public void method7416() {
		if (Class305.method26796() < this.aLong27 * 1159186737028678961L) {
			return;
		}
		@Pc(35) int local35;
		if (this.aClass466Array1 == null) {
			if (!this.aBoolean172) {
				return;
			}
			this.aClass466Array1 = new Class466[this.aSet1.size()];
			@Pc(23) int local23 = 0;
			@Pc(27) Iterator local27 = this.aSet1.iterator();
			while (local27.hasNext()) {
				local35 = (Integer) local27.next();
				this.aClass466Array1[local23++] = new Class466(local35, this.anInterface3_2.method775(local35));
			}
			this.anInt865 = 0;
			this.aBoolean172 = false;
			this.aSet1.clear();
		}
		if (this.aClass466Array1 == null || this.anInt865 * -866505885 >= this.aClass466Array1.length) {
			return;
		}
		@Pc(73) Class175 local73 = Class330.method27372();
		if (local73.anInt3299 * 195575097 > 1200) {
			return;
		}
		@Pc(86) Class93_Sub22 local86 = Class102.method2592(Class446.aClass446_53, local73.aClass24_2);
		local86.aClass93_Sub41_Sub2_1.method22454(0);
		local35 = local86.aClass93_Sub41_Sub2_1.anInt3070 * 212851357;
		local86.aClass93_Sub41_Sub2_1.anInt3070 += -1445626955;
		while (this.anInt865 * -866505885 < this.aClass466Array1.length) {
			@Pc(120) Class466 local120 = this.aClass466Array1[this.anInt865 * -866505885];
			if (local86.aClass93_Sub41_Sub2_1.anInt3070 * 212851357 + local73.anInt3299 * 195575097 + Class72.aClass79_Sub1_Sub2_2.method1461(local120) > 1500) {
				break;
			}
			Class72.aClass79_Sub1_Sub2_2.method1462(local86.aClass93_Sub41_Sub2_1, local120);
			this.anInt865 += -1626821045;
		}
		local86.aClass93_Sub41_Sub2_1.method22407(local86.aClass93_Sub41_Sub2_1.anInt3070 * 212851357 - local35);
		if (this.anInt865 * -866505885 >= this.aClass466Array1.length) {
			local86.aClass93_Sub41_Sub2_1.aByteArray58[local35] = 1;
		} else {
			local86.aClass93_Sub41_Sub2_1.aByteArray58[local35] = 0;
		}
		local73.method24351(local86);
		this.aLong27 = (Class305.method26796() + 1000L) * -1570658587136822319L;
	}

	@OriginalMember(owner = "client!afu", name = "ax", descriptor = "()V", line = 158)
	public void method7424() {
		if (Class305.method26796() < this.aLong27 * 1159186737028678961L) {
			return;
		}
		@Pc(35) int local35;
		if (this.aClass466Array1 == null) {
			if (!this.aBoolean172) {
				return;
			}
			this.aClass466Array1 = new Class466[this.aSet1.size()];
			@Pc(23) int local23 = 0;
			@Pc(27) Iterator local27 = this.aSet1.iterator();
			while (local27.hasNext()) {
				local35 = (Integer) local27.next();
				this.aClass466Array1[local23++] = new Class466(local35, this.anInterface3_2.method775(local35));
			}
			this.anInt865 = 0;
			this.aBoolean172 = false;
			this.aSet1.clear();
		}
		if (this.aClass466Array1 == null || this.anInt865 * -866505885 >= this.aClass466Array1.length) {
			return;
		}
		@Pc(73) Class175 local73 = Class330.method27372();
		if (local73.anInt3299 * 195575097 > 1200) {
			return;
		}
		@Pc(86) Class93_Sub22 local86 = Class102.method2592(Class446.aClass446_53, local73.aClass24_2);
		local86.aClass93_Sub41_Sub2_1.method22454(0);
		local35 = local86.aClass93_Sub41_Sub2_1.anInt3070 * 212851357;
		local86.aClass93_Sub41_Sub2_1.anInt3070 += -1445626955;
		while (this.anInt865 * -866505885 < this.aClass466Array1.length) {
			@Pc(120) Class466 local120 = this.aClass466Array1[this.anInt865 * -866505885];
			if (local86.aClass93_Sub41_Sub2_1.anInt3070 * 212851357 + local73.anInt3299 * 195575097 + Class72.aClass79_Sub1_Sub2_2.method1461(local120) > 1500) {
				break;
			}
			Class72.aClass79_Sub1_Sub2_2.method1462(local86.aClass93_Sub41_Sub2_1, local120);
			this.anInt865 += -1626821045;
		}
		local86.aClass93_Sub41_Sub2_1.method22407(local86.aClass93_Sub41_Sub2_1.anInt3070 * 212851357 - local35);
		if (this.anInt865 * -866505885 >= this.aClass466Array1.length) {
			local86.aClass93_Sub41_Sub2_1.aByteArray58[local35] = 1;
		} else {
			local86.aClass93_Sub41_Sub2_1.aByteArray58[local35] = 0;
		}
		local73.method24351(local86);
		this.aLong27 = (Class305.method26796() + 1000L) * -1570658587136822319L;
	}

	@OriginalMember(owner = "client!afu", name = "av", descriptor = "()V", line = 158)
	public void method7425() {
		if (Class305.method26796() < this.aLong27 * 1159186737028678961L) {
			return;
		}
		@Pc(35) int local35;
		if (this.aClass466Array1 == null) {
			if (!this.aBoolean172) {
				return;
			}
			this.aClass466Array1 = new Class466[this.aSet1.size()];
			@Pc(23) int local23 = 0;
			@Pc(27) Iterator local27 = this.aSet1.iterator();
			while (local27.hasNext()) {
				local35 = (Integer) local27.next();
				this.aClass466Array1[local23++] = new Class466(local35, this.anInterface3_2.method775(local35));
			}
			this.anInt865 = 0;
			this.aBoolean172 = false;
			this.aSet1.clear();
		}
		if (this.aClass466Array1 == null || this.anInt865 * -866505885 >= this.aClass466Array1.length) {
			return;
		}
		@Pc(73) Class175 local73 = Class330.method27372();
		if (local73.anInt3299 * 195575097 > 1200) {
			return;
		}
		@Pc(86) Class93_Sub22 local86 = Class102.method2592(Class446.aClass446_53, local73.aClass24_2);
		local86.aClass93_Sub41_Sub2_1.method22454(0);
		local35 = local86.aClass93_Sub41_Sub2_1.anInt3070 * 212851357;
		local86.aClass93_Sub41_Sub2_1.anInt3070 += -1445626955;
		while (this.anInt865 * -866505885 < this.aClass466Array1.length) {
			@Pc(120) Class466 local120 = this.aClass466Array1[this.anInt865 * -866505885];
			if (local86.aClass93_Sub41_Sub2_1.anInt3070 * 212851357 + local73.anInt3299 * 195575097 + Class72.aClass79_Sub1_Sub2_2.method1461(local120) > 1500) {
				break;
			}
			Class72.aClass79_Sub1_Sub2_2.method1462(local86.aClass93_Sub41_Sub2_1, local120);
			this.anInt865 += -1626821045;
		}
		local86.aClass93_Sub41_Sub2_1.method22407(local86.aClass93_Sub41_Sub2_1.anInt3070 * 212851357 - local35);
		if (this.anInt865 * -866505885 >= this.aClass466Array1.length) {
			local86.aClass93_Sub41_Sub2_1.aByteArray58[local35] = 1;
		} else {
			local86.aClass93_Sub41_Sub2_1.aByteArray58[local35] = 0;
		}
		local73.method24351(local86);
		this.aLong27 = (Class305.method26796() + 1000L) * -1570658587136822319L;
	}

	@OriginalMember(owner = "client!afu", name = "ad", descriptor = "(I)V", line = 195)
	public void method7412() {
		if (this.aClass466Array1 != null && this.anInt865 * -866505885 >= this.aClass466Array1.length) {
			this.aClass466Array1 = null;
			this.anInt865 = 0;
		}
	}

	@OriginalMember(owner = "client!afu", name = "aj", descriptor = "()V", line = 195)
	public void method7426() {
		if (this.aClass466Array1 != null && this.anInt865 * -866505885 >= this.aClass466Array1.length) {
			this.aClass466Array1 = null;
			this.anInt865 = 0;
		}
	}
}
