package com.jagex;

import java.io.EOFException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aaj")
public final class Class10_Sub1 extends Class10 {

	@OriginalMember(owner = "client!aaj", name = "a", descriptor = "I")
	static final int anInt93 = 1;

	@OriginalMember(owner = "client!aaj", name = "u", descriptor = "[Lclient!lq;")
	Class304[] aClass304Array1;

	@OriginalMember(owner = "client!aaj", name = "g", descriptor = "Z")
	public boolean aBoolean15 = false;

	@OriginalMember(owner = "client!aaj", name = "l", descriptor = "J")
	public long aLong6 = 5000317123365916271L;

	@OriginalMember(owner = "client!aaj", name = "h", descriptor = "Z")
	boolean aBoolean16 = false;

	@OriginalMember(owner = "client!aaj", name = "s", descriptor = "J")
	long aLong7 = 474501900333850407L;

	@OriginalMember(owner = "client!aaj", name = "y", descriptor = "I")
	int anInt94 = 0;

	@OriginalMember(owner = "client!aaj", name = "b", descriptor = "[Lclient!np;")
	final Class352[] aClass352Array1;

	@OriginalMember(owner = "client!aaj", name = "x", descriptor = "Ljava/util/Set;")
	Set aSet1;

	@OriginalMember(owner = "client!aaj", name = "<init>", descriptor = "(Lclient!zf;)V", line = 28)
	public Class10_Sub1(@OriginalArg(0) Class70_Sub1 arg0) {
		super(arg0);
		this.aClass352Array1 = new Class352[arg0.method14714()];
		for (@Pc(25) int local25 = 0; local25 < arg0.method14714(); local25++) {
			this.aClass352Array1[local25] = arg0.method14717(local25).aClass352_3;
		}
		this.aSet1 = new HashSet(arg0.method14714());
	}

	@OriginalMember(owner = "client!aaj", name = "s", descriptor = "(Lclient!cy;I)V", line = 37)
	@Override
	public void method32395(@OriginalArg(0) Class11 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass352Array1[arg0.anInt130 * -112096509] == Class352.aClass352_5) {
			this.aBoolean15 = true;
		} else if (this.aClass352Array1[arg0.anInt130 * -112096509] == Class352.aClass352_6 && this.method32385(arg0) != arg1) {
			this.aBoolean16 = true;
			this.aSet1.add(arg0.anInt130 * -112096509);
		}
		super.method32389(arg0, arg1);
	}

	@OriginalMember(owner = "client!aaj", name = "p", descriptor = "(Lclient!cy;II)V", line = 37)
	@Override
	public void method32389(@OriginalArg(0) Class11 arg0, @OriginalArg(1) int arg1) {
		if (this.aClass352Array1[arg0.anInt130 * -112096509] == Class352.aClass352_5) {
			this.aBoolean15 = true;
		} else if (this.aClass352Array1[arg0.anInt130 * -112096509] == Class352.aClass352_6 && this.method32385(arg0) != arg1) {
			this.aBoolean16 = true;
			this.aSet1.add(arg0.anInt130 * -112096509);
		}
		super.method32389(arg0, arg1);
	}

	@OriginalMember(owner = "client!aaj", name = "z", descriptor = "(Lclient!cy;J)V", line = 46)
	@Override
	public void method32398(@OriginalArg(0) Class11 arg0, @OriginalArg(1) long arg1) {
		if (this.aClass352Array1[arg0.anInt130 * -112096509] == Class352.aClass352_5) {
			this.aBoolean15 = true;
		} else if (this.aClass352Array1[arg0.anInt130 * -112096509] == Class352.aClass352_6 && this.method32393(arg0) != arg1) {
			this.aBoolean16 = true;
			this.aSet1.add(arg0.anInt130 * -112096509);
		}
		super.method32401(arg0, arg1);
	}

	@OriginalMember(owner = "client!aaj", name = "c", descriptor = "(Lclient!cy;J)V", line = 46)
	@Override
	public void method32397(@OriginalArg(0) Class11 arg0, @OriginalArg(1) long arg1) {
		if (this.aClass352Array1[arg0.anInt130 * -112096509] == Class352.aClass352_5) {
			this.aBoolean15 = true;
		} else if (this.aClass352Array1[arg0.anInt130 * -112096509] == Class352.aClass352_6 && this.method32393(arg0) != arg1) {
			this.aBoolean16 = true;
			this.aSet1.add(arg0.anInt130 * -112096509);
		}
		super.method32401(arg0, arg1);
	}

	@OriginalMember(owner = "client!aaj", name = "j", descriptor = "(Lclient!cy;J)V", line = 46)
	@Override
	public void method32399(@OriginalArg(0) Class11 arg0, @OriginalArg(1) long arg1) {
		if (this.aClass352Array1[arg0.anInt130 * -112096509] == Class352.aClass352_5) {
			this.aBoolean15 = true;
		} else if (this.aClass352Array1[arg0.anInt130 * -112096509] == Class352.aClass352_6 && this.method32393(arg0) != arg1) {
			this.aBoolean16 = true;
			this.aSet1.add(arg0.anInt130 * -112096509);
		}
		super.method32401(arg0, arg1);
	}

	@OriginalMember(owner = "client!aaj", name = "g", descriptor = "(Lclient!cy;J)V", line = 46)
	@Override
	public void method32401(@OriginalArg(0) Class11 arg0, @OriginalArg(1) long arg1) {
		if (this.aClass352Array1[arg0.anInt130 * -112096509] == Class352.aClass352_5) {
			this.aBoolean15 = true;
		} else if (this.aClass352Array1[arg0.anInt130 * -112096509] == Class352.aClass352_6 && this.method32393(arg0) != arg1) {
			this.aBoolean16 = true;
			this.aSet1.add(arg0.anInt130 * -112096509);
		}
		super.method32401(arg0, arg1);
	}

	@OriginalMember(owner = "client!aaj", name = "h", descriptor = "(Lclient!cy;Ljava/lang/Object;I)V", line = 55)
	@Override
	public void method32391(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Object arg1) {
		if (Class352.aClass352_5 == this.aClass352Array1[arg0.anInt130 * -112096509]) {
			this.aBoolean15 = true;
		} else if (this.aClass352Array1[arg0.anInt130 * -112096509] == Class352.aClass352_6) {
			if (arg1 instanceof String) {
				@Pc(27) String local27 = (String) arg1;
				if (local27.length() > 80) {
					arg1 = local27.substring(0, 80);
				}
			}
			@Pc(41) Object local41 = this.method32408(arg0);
			if (arg1 != null && local41 != null && !arg1.equals(local41)) {
				this.aBoolean16 = true;
				this.aSet1.add(arg0.anInt130 * -112096509);
			} else if ((local41 == null) != (arg1 == null)) {
				this.aBoolean16 = true;
				this.aSet1.add(arg0.anInt130 * -112096509);
			}
		}
		super.method32391(arg0, arg1);
	}

	@OriginalMember(owner = "client!aaj", name = "at", descriptor = "(Lclient!cy;Ljava/lang/Object;)V", line = 55)
	@Override
	public void method32409(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Object arg1) {
		if (Class352.aClass352_5 == this.aClass352Array1[arg0.anInt130 * -112096509]) {
			this.aBoolean15 = true;
		} else if (this.aClass352Array1[arg0.anInt130 * -112096509] == Class352.aClass352_6) {
			if (arg1 instanceof String) {
				@Pc(27) String local27 = (String) arg1;
				if (local27.length() > 80) {
					arg1 = local27.substring(0, 80);
				}
			}
			@Pc(41) Object local41 = this.method32408(arg0);
			if (arg1 != null && local41 != null && !arg1.equals(local41)) {
				this.aBoolean16 = true;
				this.aSet1.add(arg0.anInt130 * -112096509);
			} else if ((local41 == null) != (arg1 == null)) {
				this.aBoolean16 = true;
				this.aSet1.add(arg0.anInt130 * -112096509);
			}
		}
		super.method32391(arg0, arg1);
	}

	@OriginalMember(owner = "client!aaj", name = "af", descriptor = "(Lclient!cy;Ljava/lang/Object;)V", line = 55)
	@Override
	public void method32410(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Object arg1) {
		if (Class352.aClass352_5 == this.aClass352Array1[arg0.anInt130 * -112096509]) {
			this.aBoolean15 = true;
		} else if (this.aClass352Array1[arg0.anInt130 * -112096509] == Class352.aClass352_6) {
			if (arg1 instanceof String) {
				@Pc(27) String local27 = (String) arg1;
				if (local27.length() > 80) {
					arg1 = local27.substring(0, 80);
				}
			}
			@Pc(41) Object local41 = this.method32408(arg0);
			if (arg1 != null && local41 != null && !arg1.equals(local41)) {
				this.aBoolean16 = true;
				this.aSet1.add(arg0.anInt130 * -112096509);
			} else if ((local41 == null) != (arg1 == null)) {
				this.aBoolean16 = true;
				this.aSet1.add(arg0.anInt130 * -112096509);
			}
		}
		super.method32391(arg0, arg1);
	}

	@OriginalMember(owner = "client!aaj", name = "ak", descriptor = "(Lclient!cy;Ljava/lang/Object;)V", line = 55)
	@Override
	public void method32390(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Object arg1) {
		if (Class352.aClass352_5 == this.aClass352Array1[arg0.anInt130 * -112096509]) {
			this.aBoolean15 = true;
		} else if (this.aClass352Array1[arg0.anInt130 * -112096509] == Class352.aClass352_6) {
			if (arg1 instanceof String) {
				@Pc(27) String local27 = (String) arg1;
				if (local27.length() > 80) {
					arg1 = local27.substring(0, 80);
				}
			}
			@Pc(41) Object local41 = this.method32408(arg0);
			if (arg1 != null && local41 != null && !arg1.equals(local41)) {
				this.aBoolean16 = true;
				this.aSet1.add(arg0.anInt130 * -112096509);
			} else if ((local41 == null) != (arg1 == null)) {
				this.aBoolean16 = true;
				this.aSet1.add(arg0.anInt130 * -112096509);
			}
		}
		super.method32391(arg0, arg1);
	}

	@OriginalMember(owner = "client!aaj", name = "aq", descriptor = "()V", line = 75)
	public void method730() {
		for (@Pc(1) int local1 = 0; local1 < this.aClass352Array1.length; local1++) {
			if (this.aClass352Array1[local1] == Class352.aClass352_4 || this.aClass352Array1[local1] == Class352.aClass352_6) {
				this.anInterface58_2.method33312(local1);
			}
		}
		this.aSet1.clear();
		this.aBoolean16 = false;
		this.aClass304Array1 = null;
		this.aLong7 = 474501900333850407L;
	}

	@OriginalMember(owner = "client!aaj", name = "av", descriptor = "()V", line = 75)
	public void method731() {
		for (@Pc(1) int local1 = 0; local1 < this.aClass352Array1.length; local1++) {
			if (this.aClass352Array1[local1] == Class352.aClass352_4 || this.aClass352Array1[local1] == Class352.aClass352_6) {
				this.anInterface58_2.method33312(local1);
			}
		}
		this.aSet1.clear();
		this.aBoolean16 = false;
		this.aClass304Array1 = null;
		this.aLong7 = 474501900333850407L;
	}

	@OriginalMember(owner = "client!aaj", name = "ax", descriptor = "()V", line = 75)
	public void method732() {
		for (@Pc(1) int local1 = 0; local1 < this.aClass352Array1.length; local1++) {
			if (this.aClass352Array1[local1] == Class352.aClass352_4 || this.aClass352Array1[local1] == Class352.aClass352_6) {
				this.anInterface58_2.method33312(local1);
			}
		}
		this.aSet1.clear();
		this.aBoolean16 = false;
		this.aClass304Array1 = null;
		this.aLong7 = 474501900333850407L;
	}

	@OriginalMember(owner = "client!aaj", name = "aa", descriptor = "(B)V", line = 75)
	public void method738() {
		for (@Pc(1) int local1 = 0; local1 < this.aClass352Array1.length; local1++) {
			if (this.aClass352Array1[local1] == Class352.aClass352_4 || this.aClass352Array1[local1] == Class352.aClass352_6) {
				this.anInterface58_2.method33312(local1);
			}
		}
		this.aSet1.clear();
		this.aBoolean16 = false;
		this.aClass304Array1 = null;
		this.aLong7 = 474501900333850407L;
	}

	@OriginalMember(owner = "client!aaj", name = "ah", descriptor = "(I)V", line = 85)
	public void method725() {
		this.anInt94 = 0;
	}

	@OriginalMember(owner = "client!aaj", name = "az", descriptor = "()V", line = 85)
	public void method733() {
		this.anInt94 = 0;
	}

	@OriginalMember(owner = "client!aaj", name = "al", descriptor = "()V", line = 85)
	public void method734() {
		this.anInt94 = 0;
	}

	@OriginalMember(owner = "client!aaj", name = "an", descriptor = "(Lclient!xz;I)V", line = 90)
	public void method722(@OriginalArg(0) Class592 arg0) {
		try {
			@Pc(5) byte[] local5 = new byte[(int) arg0.method33340()];
			@Pc(21) int local21;
			for (@Pc(7) int local7 = 0; local7 < local5.length; local7 += local21) {
				local21 = arg0.method33341(local5, local7, local5.length - local7);
				if (local21 == -1) {
					throw new EOFException();
				}
			}
			@Pc(38) Class3_Sub41 local38 = new Class3_Sub41(local5);
			if (local38.aByteArray51.length - local38.anInt2803 * 62066237 < 1) {
				return;
			}
			@Pc(58) int local58 = local38.method20269();
			if (local58 < 0 || local58 > 1) {
				return;
			}
			if (local38.aByteArray51.length - local38.anInt2803 * 62066237 >= 2) {
				@Pc(89) int local89 = local38.method20271();
				if (local38.aByteArray51.length - local38.anInt2803 * 62066237 < local89 * 6) {
					return;
				}
				for (@Pc(109) int local109 = 0; local109 < local89; local109++) {
					@Pc(117) Class304 local117 = Class500.aClass70_Sub1_Sub2_12.method14716(local38);
					if (Class352.aClass352_5 == this.aClass352Array1[local117.anInt4428 * 1628864065] && Class500.aClass70_Sub1_Sub2_12.method14717(local117.anInt4428 * 1628864065).aClass339_3.method26428().aClass1.isAssignableFrom(local117.anObject17.getClass())) {
						this.anInterface58_2.method33310(local117.anInt4428 * 1628864065, local117.anObject17);
					}
				}
				return;
			}
		} catch (@Pc(163) Exception local163) {
			return;
		} finally {
			try {
				arg0.method33339();
			} catch (@Pc(175) Exception local175) {
			}
		}
	}

	@OriginalMember(owner = "client!aaj", name = "aj", descriptor = "(Lclient!xz;I)V", line = 124)
	public void method726(@OriginalArg(0) Class592 arg0) {
		try {
			@Pc(1) int local1 = 3;
			@Pc(3) int local3 = 0;
			@Pc(7) Iterator local7 = this.anInterface58_2.iterator();
			while (local7.hasNext()) {
				@Pc(14) Class304 local14 = (Class304) local7.next();
				if (Class352.aClass352_5 == this.aClass352Array1[local14.anInt4428 * 1628864065]) {
					local1 += Class500.aClass70_Sub1_Sub2_12.method14715(local14);
					local3++;
				}
			}
			@Pc(37) Class3_Sub41 local37 = new Class3_Sub41(local1);
			local37.method20250(1);
			local37.method20251(local3);
			@Pc(49) Iterator local49 = this.anInterface58_2.iterator();
			while (local49.hasNext()) {
				@Pc(56) Class304 local56 = (Class304) local49.next();
				if (Class352.aClass352_5 == this.aClass352Array1[local56.anInt4428 * 1628864065]) {
					Class500.aClass70_Sub1_Sub2_12.method14733(local37, local56);
				}
			}
			arg0.method33338(local37.aByteArray51, 0, local37.anInt2803 * 62066237);
		} catch (@Pc(88) Exception local88) {
		} finally {
			try {
				arg0.method33339();
			} catch (@Pc(100) Exception local100) {
			}
		}
		this.aLong6 = Class176.method23413() * -5000317123365916271L;
		this.aBoolean15 = false;
	}

	@OriginalMember(owner = "client!aaj", name = "ao", descriptor = "(Lclient!xz;)V", line = 124)
	public void method735(@OriginalArg(0) Class592 arg0) {
		try {
			@Pc(1) int local1 = 3;
			@Pc(3) int local3 = 0;
			@Pc(7) Iterator local7 = this.anInterface58_2.iterator();
			while (local7.hasNext()) {
				@Pc(14) Class304 local14 = (Class304) local7.next();
				if (Class352.aClass352_5 == this.aClass352Array1[local14.anInt4428 * 1628864065]) {
					local1 += Class500.aClass70_Sub1_Sub2_12.method14715(local14);
					local3++;
				}
			}
			@Pc(37) Class3_Sub41 local37 = new Class3_Sub41(local1);
			local37.method20250(1);
			local37.method20251(local3);
			@Pc(49) Iterator local49 = this.anInterface58_2.iterator();
			while (local49.hasNext()) {
				@Pc(56) Class304 local56 = (Class304) local49.next();
				if (Class352.aClass352_5 == this.aClass352Array1[local56.anInt4428 * 1628864065]) {
					Class500.aClass70_Sub1_Sub2_12.method14733(local37, local56);
				}
			}
			arg0.method33338(local37.aByteArray51, 0, local37.anInt2803 * 62066237);
		} catch (@Pc(88) Exception local88) {
		} finally {
			try {
				arg0.method33339();
			} catch (@Pc(100) Exception local100) {
			}
		}
		this.aLong6 = Class176.method23413() * -5000317123365916271L;
		this.aBoolean15 = false;
	}

	@OriginalMember(owner = "client!aaj", name = "ab", descriptor = "()V", line = 158)
	public void method723() {
		if (Class176.method23413() < this.aLong7 * 7575598199081279337L) {
			return;
		}
		@Pc(36) int local36;
		if (this.aClass304Array1 == null) {
			if (!this.aBoolean16) {
				return;
			}
			this.aClass304Array1 = new Class304[this.aSet1.size()];
			@Pc(24) int local24 = 0;
			@Pc(28) Iterator local28 = this.aSet1.iterator();
			while (local28.hasNext()) {
				local36 = (Integer) local28.next();
				this.aClass304Array1[local24++] = new Class304(local36, this.anInterface58_2.method33311(local36));
			}
			this.anInt94 = 0;
			this.aBoolean16 = false;
			this.aSet1.clear();
		}
		if (this.aClass304Array1 == null || this.anInt94 * -1920520255 >= this.aClass304Array1.length) {
			return;
		}
		@Pc(74) Class82 local74 = Class406.method27657();
		if (local74.anInt2917 * 187803349 > 1200) {
			return;
		}
		@Pc(87) Class3_Sub23 local87 = Class269.method25284(Class311.aClass311_106, local74.aClass577_2);
		local87.aClass3_Sub41_Sub1_1.method20251(0);
		local36 = local87.aClass3_Sub41_Sub1_1.anInt2803 * 62066237;
		local87.aClass3_Sub41_Sub1_1.anInt2803 += -918980331;
		while (this.anInt94 * -1920520255 < this.aClass304Array1.length) {
			@Pc(121) Class304 local121 = this.aClass304Array1[this.anInt94 * -1920520255];
			if (local74.anInt2917 * 187803349 + local87.aClass3_Sub41_Sub1_1.anInt2803 * 62066237 + Class500.aClass70_Sub1_Sub2_12.method14715(local121) > 1500) {
				break;
			}
			Class500.aClass70_Sub1_Sub2_12.method14733(local87.aClass3_Sub41_Sub1_1, local121);
			this.anInt94 += -1777599;
		}
		local87.aClass3_Sub41_Sub1_1.method20265(local87.aClass3_Sub41_Sub1_1.anInt2803 * 62066237 - local36);
		if (this.anInt94 * -1920520255 >= this.aClass304Array1.length) {
			local87.aClass3_Sub41_Sub1_1.aByteArray51[local36] = 1;
		} else {
			local87.aClass3_Sub41_Sub1_1.aByteArray51[local36] = 0;
		}
		local74.method21601(local87);
		this.aLong7 = (Class176.method23413() + 1000L) * -474501900333850407L;
	}

	@OriginalMember(owner = "client!aaj", name = "ay", descriptor = "()V", line = 158)
	public void method724() {
		if (Class176.method23413() < this.aLong7 * 7575598199081279337L) {
			return;
		}
		@Pc(36) int local36;
		if (this.aClass304Array1 == null) {
			if (!this.aBoolean16) {
				return;
			}
			this.aClass304Array1 = new Class304[this.aSet1.size()];
			@Pc(24) int local24 = 0;
			@Pc(28) Iterator local28 = this.aSet1.iterator();
			while (local28.hasNext()) {
				local36 = (Integer) local28.next();
				this.aClass304Array1[local24++] = new Class304(local36, this.anInterface58_2.method33311(local36));
			}
			this.anInt94 = 0;
			this.aBoolean16 = false;
			this.aSet1.clear();
		}
		if (this.aClass304Array1 == null || this.anInt94 * -1920520255 >= this.aClass304Array1.length) {
			return;
		}
		@Pc(74) Class82 local74 = Class406.method27657();
		if (local74.anInt2917 * 187803349 > 1200) {
			return;
		}
		@Pc(87) Class3_Sub23 local87 = Class269.method25284(Class311.aClass311_106, local74.aClass577_2);
		local87.aClass3_Sub41_Sub1_1.method20251(0);
		local36 = local87.aClass3_Sub41_Sub1_1.anInt2803 * 62066237;
		local87.aClass3_Sub41_Sub1_1.anInt2803 += -918980331;
		while (this.anInt94 * -1920520255 < this.aClass304Array1.length) {
			@Pc(121) Class304 local121 = this.aClass304Array1[this.anInt94 * -1920520255];
			if (local74.anInt2917 * 187803349 + local87.aClass3_Sub41_Sub1_1.anInt2803 * 62066237 + Class500.aClass70_Sub1_Sub2_12.method14715(local121) > 1500) {
				break;
			}
			Class500.aClass70_Sub1_Sub2_12.method14733(local87.aClass3_Sub41_Sub1_1, local121);
			this.anInt94 += -1777599;
		}
		local87.aClass3_Sub41_Sub1_1.method20265(local87.aClass3_Sub41_Sub1_1.anInt2803 * 62066237 - local36);
		if (this.anInt94 * -1920520255 >= this.aClass304Array1.length) {
			local87.aClass3_Sub41_Sub1_1.aByteArray51[local36] = 1;
		} else {
			local87.aClass3_Sub41_Sub1_1.aByteArray51[local36] = 0;
		}
		local74.method21601(local87);
		this.aLong7 = (Class176.method23413() + 1000L) * -474501900333850407L;
	}

	@OriginalMember(owner = "client!aaj", name = "as", descriptor = "(I)V", line = 158)
	public void method727() {
		if (Class176.method23413() < this.aLong7 * 7575598199081279337L) {
			return;
		}
		@Pc(36) int local36;
		if (this.aClass304Array1 == null) {
			if (!this.aBoolean16) {
				return;
			}
			this.aClass304Array1 = new Class304[this.aSet1.size()];
			@Pc(24) int local24 = 0;
			@Pc(28) Iterator local28 = this.aSet1.iterator();
			while (local28.hasNext()) {
				local36 = (Integer) local28.next();
				this.aClass304Array1[local24++] = new Class304(local36, this.anInterface58_2.method33311(local36));
			}
			this.anInt94 = 0;
			this.aBoolean16 = false;
			this.aSet1.clear();
		}
		if (this.aClass304Array1 == null || this.anInt94 * -1920520255 >= this.aClass304Array1.length) {
			return;
		}
		@Pc(74) Class82 local74 = Class406.method27657();
		if (local74.anInt2917 * 187803349 > 1200) {
			return;
		}
		@Pc(87) Class3_Sub23 local87 = Class269.method25284(Class311.aClass311_106, local74.aClass577_2);
		local87.aClass3_Sub41_Sub1_1.method20251(0);
		local36 = local87.aClass3_Sub41_Sub1_1.anInt2803 * 62066237;
		local87.aClass3_Sub41_Sub1_1.anInt2803 += -918980331;
		while (this.anInt94 * -1920520255 < this.aClass304Array1.length) {
			@Pc(121) Class304 local121 = this.aClass304Array1[this.anInt94 * -1920520255];
			if (local74.anInt2917 * 187803349 + local87.aClass3_Sub41_Sub1_1.anInt2803 * 62066237 + Class500.aClass70_Sub1_Sub2_12.method14715(local121) > 1500) {
				break;
			}
			Class500.aClass70_Sub1_Sub2_12.method14733(local87.aClass3_Sub41_Sub1_1, local121);
			this.anInt94 += -1777599;
		}
		local87.aClass3_Sub41_Sub1_1.method20265(local87.aClass3_Sub41_Sub1_1.anInt2803 * 62066237 - local36);
		if (this.anInt94 * -1920520255 >= this.aClass304Array1.length) {
			local87.aClass3_Sub41_Sub1_1.aByteArray51[local36] = 1;
		} else {
			local87.aClass3_Sub41_Sub1_1.aByteArray51[local36] = 0;
		}
		local74.method21601(local87);
		this.aLong7 = (Class176.method23413() + 1000L) * -474501900333850407L;
	}

	@OriginalMember(owner = "client!aaj", name = "ap", descriptor = "()V", line = 158)
	public void method736() {
		if (Class176.method23413() < this.aLong7 * 7575598199081279337L) {
			return;
		}
		@Pc(36) int local36;
		if (this.aClass304Array1 == null) {
			if (!this.aBoolean16) {
				return;
			}
			this.aClass304Array1 = new Class304[this.aSet1.size()];
			@Pc(24) int local24 = 0;
			@Pc(28) Iterator local28 = this.aSet1.iterator();
			while (local28.hasNext()) {
				local36 = (Integer) local28.next();
				this.aClass304Array1[local24++] = new Class304(local36, this.anInterface58_2.method33311(local36));
			}
			this.anInt94 = 0;
			this.aBoolean16 = false;
			this.aSet1.clear();
		}
		if (this.aClass304Array1 == null || this.anInt94 * -1920520255 >= this.aClass304Array1.length) {
			return;
		}
		@Pc(74) Class82 local74 = Class406.method27657();
		if (local74.anInt2917 * 187803349 > 1200) {
			return;
		}
		@Pc(87) Class3_Sub23 local87 = Class269.method25284(Class311.aClass311_106, local74.aClass577_2);
		local87.aClass3_Sub41_Sub1_1.method20251(0);
		local36 = local87.aClass3_Sub41_Sub1_1.anInt2803 * 62066237;
		local87.aClass3_Sub41_Sub1_1.anInt2803 += -918980331;
		while (this.anInt94 * -1920520255 < this.aClass304Array1.length) {
			@Pc(121) Class304 local121 = this.aClass304Array1[this.anInt94 * -1920520255];
			if (local74.anInt2917 * 187803349 + local87.aClass3_Sub41_Sub1_1.anInt2803 * 62066237 + Class500.aClass70_Sub1_Sub2_12.method14715(local121) > 1500) {
				break;
			}
			Class500.aClass70_Sub1_Sub2_12.method14733(local87.aClass3_Sub41_Sub1_1, local121);
			this.anInt94 += -1777599;
		}
		local87.aClass3_Sub41_Sub1_1.method20265(local87.aClass3_Sub41_Sub1_1.anInt2803 * 62066237 - local36);
		if (this.anInt94 * -1920520255 >= this.aClass304Array1.length) {
			local87.aClass3_Sub41_Sub1_1.aByteArray51[local36] = 1;
		} else {
			local87.aClass3_Sub41_Sub1_1.aByteArray51[local36] = 0;
		}
		local74.method21601(local87);
		this.aLong7 = (Class176.method23413() + 1000L) * -474501900333850407L;
	}

	@OriginalMember(owner = "client!aaj", name = "au", descriptor = "()V", line = 158)
	public void method737() {
		if (Class176.method23413() < this.aLong7 * 7575598199081279337L) {
			return;
		}
		@Pc(36) int local36;
		if (this.aClass304Array1 == null) {
			if (!this.aBoolean16) {
				return;
			}
			this.aClass304Array1 = new Class304[this.aSet1.size()];
			@Pc(24) int local24 = 0;
			@Pc(28) Iterator local28 = this.aSet1.iterator();
			while (local28.hasNext()) {
				local36 = (Integer) local28.next();
				this.aClass304Array1[local24++] = new Class304(local36, this.anInterface58_2.method33311(local36));
			}
			this.anInt94 = 0;
			this.aBoolean16 = false;
			this.aSet1.clear();
		}
		if (this.aClass304Array1 == null || this.anInt94 * -1920520255 >= this.aClass304Array1.length) {
			return;
		}
		@Pc(74) Class82 local74 = Class406.method27657();
		if (local74.anInt2917 * 187803349 > 1200) {
			return;
		}
		@Pc(87) Class3_Sub23 local87 = Class269.method25284(Class311.aClass311_106, local74.aClass577_2);
		local87.aClass3_Sub41_Sub1_1.method20251(0);
		local36 = local87.aClass3_Sub41_Sub1_1.anInt2803 * 62066237;
		local87.aClass3_Sub41_Sub1_1.anInt2803 += -918980331;
		while (this.anInt94 * -1920520255 < this.aClass304Array1.length) {
			@Pc(121) Class304 local121 = this.aClass304Array1[this.anInt94 * -1920520255];
			if (local74.anInt2917 * 187803349 + local87.aClass3_Sub41_Sub1_1.anInt2803 * 62066237 + Class500.aClass70_Sub1_Sub2_12.method14715(local121) > 1500) {
				break;
			}
			Class500.aClass70_Sub1_Sub2_12.method14733(local87.aClass3_Sub41_Sub1_1, local121);
			this.anInt94 += -1777599;
		}
		local87.aClass3_Sub41_Sub1_1.method20265(local87.aClass3_Sub41_Sub1_1.anInt2803 * 62066237 - local36);
		if (this.anInt94 * -1920520255 >= this.aClass304Array1.length) {
			local87.aClass3_Sub41_Sub1_1.aByteArray51[local36] = 1;
		} else {
			local87.aClass3_Sub41_Sub1_1.aByteArray51[local36] = 0;
		}
		local74.method21601(local87);
		this.aLong7 = (Class176.method23413() + 1000L) * -474501900333850407L;
	}

	@OriginalMember(owner = "client!aaj", name = "ag", descriptor = "()V", line = 158)
	public void method739() {
		if (Class176.method23413() < this.aLong7 * 7575598199081279337L) {
			return;
		}
		@Pc(36) int local36;
		if (this.aClass304Array1 == null) {
			if (!this.aBoolean16) {
				return;
			}
			this.aClass304Array1 = new Class304[this.aSet1.size()];
			@Pc(24) int local24 = 0;
			@Pc(28) Iterator local28 = this.aSet1.iterator();
			while (local28.hasNext()) {
				local36 = (Integer) local28.next();
				this.aClass304Array1[local24++] = new Class304(local36, this.anInterface58_2.method33311(local36));
			}
			this.anInt94 = 0;
			this.aBoolean16 = false;
			this.aSet1.clear();
		}
		if (this.aClass304Array1 == null || this.anInt94 * -1920520255 >= this.aClass304Array1.length) {
			return;
		}
		@Pc(74) Class82 local74 = Class406.method27657();
		if (local74.anInt2917 * 187803349 > 1200) {
			return;
		}
		@Pc(87) Class3_Sub23 local87 = Class269.method25284(Class311.aClass311_106, local74.aClass577_2);
		local87.aClass3_Sub41_Sub1_1.method20251(0);
		local36 = local87.aClass3_Sub41_Sub1_1.anInt2803 * 62066237;
		local87.aClass3_Sub41_Sub1_1.anInt2803 += -918980331;
		while (this.anInt94 * -1920520255 < this.aClass304Array1.length) {
			@Pc(121) Class304 local121 = this.aClass304Array1[this.anInt94 * -1920520255];
			if (local74.anInt2917 * 187803349 + local87.aClass3_Sub41_Sub1_1.anInt2803 * 62066237 + Class500.aClass70_Sub1_Sub2_12.method14715(local121) > 1500) {
				break;
			}
			Class500.aClass70_Sub1_Sub2_12.method14733(local87.aClass3_Sub41_Sub1_1, local121);
			this.anInt94 += -1777599;
		}
		local87.aClass3_Sub41_Sub1_1.method20265(local87.aClass3_Sub41_Sub1_1.anInt2803 * 62066237 - local36);
		if (this.anInt94 * -1920520255 >= this.aClass304Array1.length) {
			local87.aClass3_Sub41_Sub1_1.aByteArray51[local36] = 1;
		} else {
			local87.aClass3_Sub41_Sub1_1.aByteArray51[local36] = 0;
		}
		local74.method21601(local87);
		this.aLong7 = (Class176.method23413() + 1000L) * -474501900333850407L;
	}

	@OriginalMember(owner = "client!aaj", name = "am", descriptor = "()V", line = 158)
	public void method740() {
		if (Class176.method23413() < this.aLong7 * 7575598199081279337L) {
			return;
		}
		@Pc(36) int local36;
		if (this.aClass304Array1 == null) {
			if (!this.aBoolean16) {
				return;
			}
			this.aClass304Array1 = new Class304[this.aSet1.size()];
			@Pc(24) int local24 = 0;
			@Pc(28) Iterator local28 = this.aSet1.iterator();
			while (local28.hasNext()) {
				local36 = (Integer) local28.next();
				this.aClass304Array1[local24++] = new Class304(local36, this.anInterface58_2.method33311(local36));
			}
			this.anInt94 = 0;
			this.aBoolean16 = false;
			this.aSet1.clear();
		}
		if (this.aClass304Array1 == null || this.anInt94 * -1920520255 >= this.aClass304Array1.length) {
			return;
		}
		@Pc(74) Class82 local74 = Class406.method27657();
		if (local74.anInt2917 * 187803349 > 1200) {
			return;
		}
		@Pc(87) Class3_Sub23 local87 = Class269.method25284(Class311.aClass311_106, local74.aClass577_2);
		local87.aClass3_Sub41_Sub1_1.method20251(0);
		local36 = local87.aClass3_Sub41_Sub1_1.anInt2803 * 62066237;
		local87.aClass3_Sub41_Sub1_1.anInt2803 += -918980331;
		while (this.anInt94 * -1920520255 < this.aClass304Array1.length) {
			@Pc(121) Class304 local121 = this.aClass304Array1[this.anInt94 * -1920520255];
			if (local74.anInt2917 * 187803349 + local87.aClass3_Sub41_Sub1_1.anInt2803 * 62066237 + Class500.aClass70_Sub1_Sub2_12.method14715(local121) > 1500) {
				break;
			}
			Class500.aClass70_Sub1_Sub2_12.method14733(local87.aClass3_Sub41_Sub1_1, local121);
			this.anInt94 += -1777599;
		}
		local87.aClass3_Sub41_Sub1_1.method20265(local87.aClass3_Sub41_Sub1_1.anInt2803 * 62066237 - local36);
		if (this.anInt94 * -1920520255 >= this.aClass304Array1.length) {
			local87.aClass3_Sub41_Sub1_1.aByteArray51[local36] = 1;
		} else {
			local87.aClass3_Sub41_Sub1_1.aByteArray51[local36] = 0;
		}
		local74.method21601(local87);
		this.aLong7 = (Class176.method23413() + 1000L) * -474501900333850407L;
	}

	@OriginalMember(owner = "client!aaj", name = "ai", descriptor = "(B)V", line = 195)
	public void method728() {
		if (this.aClass304Array1 != null && this.anInt94 * -1920520255 >= this.aClass304Array1.length) {
			this.aClass304Array1 = null;
			this.anInt94 = 0;
		}
	}

	@OriginalMember(owner = "client!aaj", name = "ar", descriptor = "()V", line = 195)
	public void method729() {
		if (this.aClass304Array1 != null && this.anInt94 * -1920520255 >= this.aClass304Array1.length) {
			this.aClass304Array1 = null;
			this.anInt94 = 0;
		}
	}

	@OriginalMember(owner = "client!aaj", name = "sk", descriptor = "(Lclient!vs;I)V", line = 7356)
	static final void method742(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local16.anInt3574 * -1289212201;
	}

	@OriginalMember(owner = "client!aaj", name = "aut", descriptor = "(Lclient!vs;B)V", line = 12546)
	static final void method741(@OriginalArg(0) Class536 arg0) {
		@Pc(3) Class26_Sub1_Sub1_Sub1_Sub1 local3 = (Class26_Sub1_Sub1_Sub1_Sub1) arg0.aClass26_Sub1_Sub1_Sub1_4;
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local3.anInt2270 * 1652771427;
	}
}
