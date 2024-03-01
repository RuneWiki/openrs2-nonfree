package com.jagex;

import java.util.ArrayList;
import java.util.List;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tm")
public class Class485 implements Interface52 {

	@OriginalMember(owner = "client!tm", name = "my", descriptor = "Lclient!fo;")
	static Class178 aClass178_17;

	@OriginalMember(owner = "client!tm", name = "cl", descriptor = "I")
	public static int anInt5182;

	@OriginalMember(owner = "client!tm", name = "c", descriptor = "Lclient!dx;")
	static Class15 aClass15_3;

	@OriginalMember(owner = "client!tm", name = "gf", descriptor = "Lclient!ny;")
	public static Class359 aClass359_90;

	@OriginalMember(owner = "client!tm", name = "x", descriptor = "[B")
	byte[] aByteArray96;

	@OriginalMember(owner = "client!tm", name = "s", descriptor = "Z")
	boolean aBoolean804;

	@OriginalMember(owner = "client!tm", name = "u", descriptor = "I")
	int anInt5181;

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "Lclient!tc;")
	Class475 aClass475_5 = Class475.aClass475_1;

	@OriginalMember(owner = "client!tm", name = "l", descriptor = "Lclient!ny;")
	Class359 aClass359_89;

	@OriginalMember(owner = "client!tm", name = "g", descriptor = "I")
	int anInt5180;

	@OriginalMember(owner = "client!tm", name = "p", descriptor = "Lclient!ju;")
	Class48 aClass48_5;

	@OriginalMember(owner = "client!tm", name = "h", descriptor = "Lclient!sv;")
	Interface51 anInterface51_2;

	@OriginalMember(owner = "client!tm", name = "y", descriptor = "Lclient!ew;")
	Class161 aClass161_54;

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "Z")
	boolean aBoolean803;

	@OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(Lclient!ny;ILclient!ju;Lclient!sv;Lclient!ew;)V", line = 24)
	public Class485(@OriginalArg(0) Class359 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class48 arg2, @OriginalArg(3) Interface51 arg3, @OriginalArg(4) Class161 arg4) {
		this.aClass359_89 = arg0;
		this.anInt5180 = arg1 * 2116203829;
		this.aClass48_5 = arg2;
		this.anInterface51_2 = arg3;
		this.aClass161_54 = arg4;
		this.aBoolean803 = this.aClass161_54 != null;
		this.aClass475_5 = Class475.aClass475_2;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(Ljava/lang/String;ZZI)V", line = 28)
	public static void method29178(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		Class23.method5938(arg0, arg1, "openjs", arg2);
	}

	@OriginalMember(owner = "client!tm", name = "p", descriptor = "(I)V", line = 35)
	@Override
	public void method29116() {
		if (Class475.aClass475_2 != this.aClass475_5) {
			return;
		}
		@Pc(12) byte[] local12 = this.aClass359_89.method26705(this.anInt5180 * -913853155);
		if (local12 == null) {
			return;
		}
		this.aByteArray96 = local12;
		this.method29166();
		this.aClass475_5 = Class475.aClass475_3;
		if (this.anInterface51_2 != null) {
			this.anInterface51_2.method23112(this, local12.length, this.anInt5180 * -913853155, false);
		}
	}

	@OriginalMember(owner = "client!tm", name = "t", descriptor = "()V", line = 35)
	@Override
	public void method29130() {
		if (Class475.aClass475_2 != this.aClass475_5) {
			return;
		}
		@Pc(12) byte[] local12 = this.aClass359_89.method26705(this.anInt5180 * -913853155);
		if (local12 == null) {
			return;
		}
		this.aByteArray96 = local12;
		this.method29166();
		this.aClass475_5 = Class475.aClass475_3;
		if (this.anInterface51_2 != null) {
			this.anInterface51_2.method23112(this, local12.length, this.anInt5180 * -913853155, false);
		}
	}

	@OriginalMember(owner = "client!tm", name = "m", descriptor = "()V", line = 35)
	@Override
	public void method29157() {
		if (Class475.aClass475_2 != this.aClass475_5) {
			return;
		}
		@Pc(12) byte[] local12 = this.aClass359_89.method26705(this.anInt5180 * -913853155);
		if (local12 == null) {
			return;
		}
		this.aByteArray96 = local12;
		this.method29166();
		this.aClass475_5 = Class475.aClass475_3;
		if (this.anInterface51_2 != null) {
			this.anInterface51_2.method23112(this, local12.length, this.anInt5180 * -913853155, false);
		}
	}

	@OriginalMember(owner = "client!tm", name = "w", descriptor = "()V", line = 35)
	@Override
	public void method29150() {
		if (Class475.aClass475_2 != this.aClass475_5) {
			return;
		}
		@Pc(12) byte[] local12 = this.aClass359_89.method26705(this.anInt5180 * -913853155);
		if (local12 == null) {
			return;
		}
		this.aByteArray96 = local12;
		this.method29166();
		this.aClass475_5 = Class475.aClass475_3;
		if (this.anInterface51_2 != null) {
			this.anInterface51_2.method23112(this, local12.length, this.anInt5180 * -913853155, false);
		}
	}

	@OriginalMember(owner = "client!tm", name = "v", descriptor = "()V", line = 35)
	@Override
	public void method29129() {
		if (Class475.aClass475_2 != this.aClass475_5) {
			return;
		}
		@Pc(12) byte[] local12 = this.aClass359_89.method26705(this.anInt5180 * -913853155);
		if (local12 == null) {
			return;
		}
		this.aByteArray96 = local12;
		this.method29166();
		this.aClass475_5 = Class475.aClass475_3;
		if (this.anInterface51_2 != null) {
			this.anInterface51_2.method23112(this, local12.length, this.anInt5180 * -913853155, false);
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(B)Lclient!oh;", line = 49)
	@Override
	public Class366 method29122() {
		@Pc(5) Class366 local5 = new Class366(this.aClass48_5);
		local5.method26815(this);
		return local5;
	}

	@OriginalMember(owner = "client!tm", name = "o", descriptor = "()Lclient!oh;", line = 49)
	@Override
	public Class366 method29139() {
		@Pc(5) Class366 local5 = new Class366(this.aClass48_5);
		local5.method26815(this);
		return local5;
	}

	@OriginalMember(owner = "client!tm", name = "i", descriptor = "()Lclient!oh;", line = 49)
	@Override
	public Class366 method29133() {
		@Pc(5) Class366 local5 = new Class366(this.aClass48_5);
		local5.method26815(this);
		return local5;
	}

	@OriginalMember(owner = "client!tm", name = "f", descriptor = "()Lclient!tc;", line = 55)
	@Override
	public Class475 method29134() {
		return this.aClass475_5;
	}

	@OriginalMember(owner = "client!tm", name = "g", descriptor = "(I)Lclient!tc;", line = 55)
	@Override
	public Class475 method29156() {
		return this.aClass475_5;
	}

	@OriginalMember(owner = "client!tm", name = "l", descriptor = "(I)Z", line = 59)
	@Override
	public boolean method29115() {
		return false;
	}

	@OriginalMember(owner = "client!tm", name = "k", descriptor = "()Z", line = 59)
	@Override
	public boolean method29135() {
		return false;
	}

	@OriginalMember(owner = "client!tm", name = "at", descriptor = "()Z", line = 59)
	@Override
	public boolean method29136() {
		return false;
	}

	@OriginalMember(owner = "client!tm", name = "af", descriptor = "()V", line = 62)
	void method29165() {
	}

	@OriginalMember(owner = "client!tm", name = "h", descriptor = "(I)V", line = 62)
	void method29166() {
	}

	@OriginalMember(owner = "client!tm", name = "ak", descriptor = "()V", line = 62)
	void method29169() {
	}

	@OriginalMember(owner = "client!tm", name = "aa", descriptor = "()V", line = 62)
	void method29170() {
	}

	@OriginalMember(owner = "client!tm", name = "x", descriptor = "(II)[B", line = 65)
	@Override
	public byte[] method29117(@OriginalArg(0) int arg0) {
		if (this.anInterface51_2 != null) {
			this.anInterface51_2.method23107(this);
		}
		return this.aByteArray96;
	}

	@OriginalMember(owner = "client!tm", name = "ah", descriptor = "(I)[B", line = 65)
	@Override
	public byte[] method29137(@OriginalArg(0) int arg0) {
		if (this.anInterface51_2 != null) {
			this.anInterface51_2.method23107(this);
		}
		return this.aByteArray96;
	}

	@OriginalMember(owner = "client!tm", name = "s", descriptor = "(I)I", line = 72)
	@Override
	public int method29118() {
		return this.aByteArray96 == null ? 0 : this.aByteArray96.length;
	}

	@OriginalMember(owner = "client!tm", name = "aj", descriptor = "()I", line = 72)
	@Override
	public int method29142() {
		return this.aByteArray96 == null ? 0 : this.aByteArray96.length;
	}

	@OriginalMember(owner = "client!tm", name = "as", descriptor = "()I", line = 72)
	@Override
	public int method29146() {
		return this.aByteArray96 == null ? 0 : this.aByteArray96.length;
	}

	@OriginalMember(owner = "client!tm", name = "an", descriptor = "()I", line = 72)
	@Override
	public int method29114() {
		return this.aByteArray96 == null ? 0 : this.aByteArray96.length;
	}

	@OriginalMember(owner = "client!tm", name = "u", descriptor = "(I)Lclient!nu;", line = 77)
	@Override
	public Class357 method29119() {
		return Class357.aClass357_2;
	}

	@OriginalMember(owner = "client!tm", name = "aq", descriptor = "()Lclient!nu;", line = 77)
	@Override
	public Class357 method29153() {
		return Class357.aClass357_2;
	}

	@OriginalMember(owner = "client!tm", name = "ai", descriptor = "()Lclient!nu;", line = 77)
	@Override
	public Class357 method29138() {
		return Class357.aClass357_2;
	}

	@OriginalMember(owner = "client!tm", name = "al", descriptor = "()I", line = 81)
	@Override
	public int method29141() {
		return this.anInt5180 * -913853155;
	}

	@OriginalMember(owner = "client!tm", name = "y", descriptor = "(B)I", line = 81)
	@Override
	public int method29120() {
		return this.anInt5180 * -913853155;
	}

	@OriginalMember(owner = "client!tm", name = "av", descriptor = "()I", line = 81)
	@Override
	public int method29143() {
		return this.anInt5180 * -913853155;
	}

	@OriginalMember(owner = "client!tm", name = "ax", descriptor = "()I", line = 81)
	@Override
	public int method29164() {
		return this.anInt5180 * -913853155;
	}

	@OriginalMember(owner = "client!tm", name = "az", descriptor = "()I", line = 81)
	@Override
	public int method29145() {
		return this.anInt5180 * -913853155;
	}

	@OriginalMember(owner = "client!tm", name = "ao", descriptor = "()I", line = 81)
	@Override
	public int method29147() {
		return this.anInt5180 * -913853155;
	}

	@OriginalMember(owner = "client!tm", name = "ap", descriptor = "()I", line = 81)
	@Override
	public int method29131() {
		return this.anInt5180 * -913853155;
	}

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "(Lclient!ahb;I)V", line = 85)
	@Override
	public void method29121(@OriginalArg(0) Class3_Sub41 arg0) {
		if (this.aClass161_54 == null) {
			return;
		}
		if (this.anInterface51_2 != null) {
			this.anInterface51_2.method23107(this);
		}
		if (this.aBoolean804) {
			throw new RuntimeException("");
		}
		@Pc(24) Class161 local24 = this.aClass161_54;
		synchronized (this.aClass161_54) {
			@Pc(29) List local29 = this.method29167();
			if (local29 != null) {
				local29.add(arg0);
				this.anInt5181 += arg0.aByteArray51.length * -780449199;
				this.method29172(local29, this.anInt5181 * -1088274767);
			}
		}
	}

	@OriginalMember(owner = "client!tm", name = "ab", descriptor = "(Lclient!ahb;)V", line = 85)
	@Override
	public void method29149(@OriginalArg(0) Class3_Sub41 arg0) {
		if (this.aClass161_54 == null) {
			return;
		}
		if (this.anInterface51_2 != null) {
			this.anInterface51_2.method23107(this);
		}
		if (this.aBoolean804) {
			throw new RuntimeException("");
		}
		@Pc(24) Class161 local24 = this.aClass161_54;
		synchronized (this.aClass161_54) {
			@Pc(29) List local29 = this.method29167();
			if (local29 != null) {
				local29.add(arg0);
				this.anInt5181 += arg0.aByteArray51.length * -780449199;
				this.method29172(local29, this.anInt5181 * -1088274767);
			}
		}
	}

	@OriginalMember(owner = "client!tm", name = "c", descriptor = "(IB)Lclient!ahb;", line = 103)
	@Override
	public Class3_Sub41 method29151(@OriginalArg(0) int arg0) {
		if (this.aClass161_54 == null) {
			return null;
		}
		@Pc(6) Class3_Sub41 local6 = null;
		if (this.anInterface51_2 != null) {
			this.anInterface51_2.method23107(this);
		}
		@Pc(18) Class161 local18 = this.aClass161_54;
		synchronized (this.aClass161_54) {
			@Pc(23) List local23 = this.method29167();
			if (local23.size() > arg0) {
				local6 = (Class3_Sub41) local23.get(arg0);
			}
			return local6;
		}
	}

	@OriginalMember(owner = "client!tm", name = "au", descriptor = "(I)Lclient!ahb;", line = 103)
	@Override
	public Class3_Sub41 method29161(@OriginalArg(0) int arg0) {
		if (this.aClass161_54 == null) {
			return null;
		}
		@Pc(6) Class3_Sub41 local6 = null;
		if (this.anInterface51_2 != null) {
			this.anInterface51_2.method23107(this);
		}
		@Pc(18) Class161 local18 = this.aClass161_54;
		synchronized (this.aClass161_54) {
			@Pc(23) List local23 = this.method29167();
			if (local23.size() > arg0) {
				local6 = (Class3_Sub41) local23.get(arg0);
			}
			return local6;
		}
	}

	@OriginalMember(owner = "client!tm", name = "am", descriptor = "(I)Lclient!ahb;", line = 103)
	@Override
	public Class3_Sub41 method29128(@OriginalArg(0) int arg0) {
		if (this.aClass161_54 == null) {
			return null;
		}
		@Pc(6) Class3_Sub41 local6 = null;
		if (this.anInterface51_2 != null) {
			this.anInterface51_2.method23107(this);
		}
		@Pc(18) Class161 local18 = this.aClass161_54;
		synchronized (this.aClass161_54) {
			@Pc(23) List local23 = this.method29167();
			if (local23.size() > arg0) {
				local6 = (Class3_Sub41) local23.get(arg0);
			}
			return local6;
		}
	}

	@OriginalMember(owner = "client!tm", name = "ag", descriptor = "(I)Lclient!ahb;", line = 103)
	@Override
	public Class3_Sub41 method29152(@OriginalArg(0) int arg0) {
		if (this.aClass161_54 == null) {
			return null;
		}
		@Pc(6) Class3_Sub41 local6 = null;
		if (this.anInterface51_2 != null) {
			this.anInterface51_2.method23107(this);
		}
		@Pc(18) Class161 local18 = this.aClass161_54;
		synchronized (this.aClass161_54) {
			@Pc(23) List local23 = this.method29167();
			if (local23.size() > arg0) {
				local6 = (Class3_Sub41) local23.get(arg0);
			}
			return local6;
		}
	}

	@OriginalMember(owner = "client!tm", name = "ay", descriptor = "(I)Lclient!ahb;", line = 103)
	@Override
	public Class3_Sub41 method29113(@OriginalArg(0) int arg0) {
		if (this.aClass161_54 == null) {
			return null;
		}
		@Pc(6) Class3_Sub41 local6 = null;
		if (this.anInterface51_2 != null) {
			this.anInterface51_2.method23107(this);
		}
		@Pc(18) Class161 local18 = this.aClass161_54;
		synchronized (this.aClass161_54) {
			@Pc(23) List local23 = this.method29167();
			if (local23.size() > arg0) {
				local6 = (Class3_Sub41) local23.get(arg0);
			}
			return local6;
		}
	}

	@OriginalMember(owner = "client!tm", name = "ae", descriptor = "(I)Z", line = 118)
	@Override
	public boolean method29155(@OriginalArg(0) int arg0) {
		if (this.aClass161_54 == null) {
			return false;
		}
		@Pc(7) boolean local7 = false;
		@Pc(11) Class161 local11 = this.aClass161_54;
		synchronized (this.aClass161_54) {
			@Pc(16) List local16 = this.method29167();
			if (local16 != null && local16.size() > arg0) {
				local7 = local16.get(arg0) != null;
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!tm", name = "ar", descriptor = "(I)Z", line = 118)
	@Override
	public boolean method29154(@OriginalArg(0) int arg0) {
		if (this.aClass161_54 == null) {
			return false;
		}
		@Pc(7) boolean local7 = false;
		@Pc(11) Class161 local11 = this.aClass161_54;
		synchronized (this.aClass161_54) {
			@Pc(16) List local16 = this.method29167();
			if (local16 != null && local16.size() > arg0) {
				local7 = local16.get(arg0) != null;
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!tm", name = "z", descriptor = "(IB)Z", line = 118)
	@Override
	public boolean method29124(@OriginalArg(0) int arg0) {
		if (this.aClass161_54 == null) {
			return false;
		}
		@Pc(7) boolean local7 = false;
		@Pc(11) Class161 local11 = this.aClass161_54;
		synchronized (this.aClass161_54) {
			@Pc(16) List local16 = this.method29167();
			if (local16 != null && local16.size() > arg0) {
				local7 = local16.get(arg0) != null;
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!tm", name = "j", descriptor = "(I)Z", line = 130)
	@Override
	public boolean method29123() {
		return this.aClass161_54 != null && this.aBoolean803;
	}

	@OriginalMember(owner = "client!tm", name = "bg", descriptor = "()Z", line = 130)
	@Override
	public boolean method29163() {
		return this.aClass161_54 != null && this.aBoolean803;
	}

	@OriginalMember(owner = "client!tm", name = "bt", descriptor = "()Z", line = 130)
	@Override
	public boolean method29132() {
		return this.aClass161_54 != null && this.aBoolean803;
	}

	@OriginalMember(owner = "client!tm", name = "bk", descriptor = "()Z", line = 130)
	@Override
	public boolean method29162() {
		return this.aClass161_54 != null && this.aBoolean803;
	}

	@OriginalMember(owner = "client!tm", name = "br", descriptor = "()Z", line = 130)
	@Override
	public boolean method29140() {
		return this.aClass161_54 != null && this.aBoolean803;
	}

	@OriginalMember(owner = "client!tm", name = "n", descriptor = "(B)I", line = 134)
	@Override
	public int method29125() {
		if (this.aClass161_54 == null) {
			return 0;
		}
		@Pc(6) int local6 = 0;
		@Pc(10) Class161 local10 = this.aClass161_54;
		synchronized (this.aClass161_54) {
			@Pc(15) List local15 = this.method29167();
			if (local15 != null) {
				local6 = local15.size();
			}
			return local6;
		}
	}

	@OriginalMember(owner = "client!tm", name = "ad", descriptor = "()I", line = 134)
	@Override
	public int method29127() {
		if (this.aClass161_54 == null) {
			return 0;
		}
		@Pc(6) int local6 = 0;
		@Pc(10) Class161 local10 = this.aClass161_54;
		synchronized (this.aClass161_54) {
			@Pc(15) List local15 = this.method29167();
			if (local15 != null) {
				local6 = local15.size();
			}
			return local6;
		}
	}

	@OriginalMember(owner = "client!tm", name = "aw", descriptor = "()I", line = 134)
	@Override
	public int method29144() {
		if (this.aClass161_54 == null) {
			return 0;
		}
		@Pc(6) int local6 = 0;
		@Pc(10) Class161 local10 = this.aClass161_54;
		synchronized (this.aClass161_54) {
			@Pc(15) List local15 = this.method29167();
			if (local15 != null) {
				local6 = local15.size();
			}
			return local6;
		}
	}

	@OriginalMember(owner = "client!tm", name = "e", descriptor = "(ZI)V", line = 146)
	@Override
	public void method29126(@OriginalArg(0) boolean arg0) {
		if (this.anInterface51_2 != null) {
			this.anInterface51_2.method23107(this);
		}
		this.aBoolean804 = arg0;
	}

	@OriginalMember(owner = "client!tm", name = "ac", descriptor = "(Z)V", line = 146)
	@Override
	public void method29158(@OriginalArg(0) boolean arg0) {
		if (this.anInterface51_2 != null) {
			this.anInterface51_2.method23107(this);
		}
		this.aBoolean804 = arg0;
	}

	@OriginalMember(owner = "client!tm", name = "bw", descriptor = "(Z)V", line = 146)
	@Override
	public void method29159(@OriginalArg(0) boolean arg0) {
		if (this.anInterface51_2 != null) {
			this.anInterface51_2.method23107(this);
		}
		this.aBoolean804 = arg0;
	}

	@OriginalMember(owner = "client!tm", name = "bp", descriptor = "()Z", line = 153)
	@Override
	public boolean method29160() {
		if (this.aClass161_54 == null) {
			return false;
		}
		@Pc(9) List local9 = this.method29167();
		if (local9 == null || local9.size() <= 0) {
			this.aBoolean804 = false;
		}
		return this.aBoolean804;
	}

	@OriginalMember(owner = "client!tm", name = "r", descriptor = "(I)Z", line = 153)
	@Override
	public boolean method29148() {
		if (this.aClass161_54 == null) {
			return false;
		}
		@Pc(9) List local9 = this.method29167();
		if (local9 == null || local9.size() <= 0) {
			this.aBoolean804 = false;
		}
		return this.aBoolean804;
	}

	@OriginalMember(owner = "client!tm", name = "bs", descriptor = "(Ljava/util/List;I)V", line = 160)
	void method29168(@OriginalArg(0) List arg0, @OriginalArg(1) int arg1) {
		if (this.aClass161_54 == null || arg0 == null || arg1 < 0) {
			return;
		}
		@Pc(12) Class161 local12 = this.aClass161_54;
		synchronized (this.aClass161_54) {
			this.aClass161_54.method23220((long) (this.anInt5180 * -913853155));
			if (arg1 <= this.aClass161_54.method23225()) {
				this.aClass161_54.method23239(arg0, (long) (this.anInt5180 * -913853155), arg1);
			} else {
				this.aBoolean803 = false;
				this.aBoolean804 = false;
				this.anInt5181 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!tm", name = "bd", descriptor = "(Ljava/util/List;I)V", line = 160)
	void method29171(@OriginalArg(0) List arg0, @OriginalArg(1) int arg1) {
		if (this.aClass161_54 == null || arg0 == null || arg1 < 0) {
			return;
		}
		@Pc(12) Class161 local12 = this.aClass161_54;
		synchronized (this.aClass161_54) {
			this.aClass161_54.method23220((long) (this.anInt5180 * -913853155));
			if (arg1 <= this.aClass161_54.method23225()) {
				this.aClass161_54.method23239(arg0, (long) (this.anInt5180 * -913853155), arg1);
			} else {
				this.aBoolean803 = false;
				this.aBoolean804 = false;
				this.anInt5181 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!tm", name = "d", descriptor = "(Ljava/util/List;II)V", line = 160)
	void method29172(@OriginalArg(0) List arg0, @OriginalArg(1) int arg1) {
		if (this.aClass161_54 == null || arg0 == null || arg1 < 0) {
			return;
		}
		@Pc(12) Class161 local12 = this.aClass161_54;
		synchronized (this.aClass161_54) {
			this.aClass161_54.method23220((long) (this.anInt5180 * -913853155));
			if (arg1 <= this.aClass161_54.method23225()) {
				this.aClass161_54.method23239(arg0, (long) (this.anInt5180 * -913853155), arg1);
			} else {
				this.aBoolean803 = false;
				this.aBoolean804 = false;
				this.anInt5181 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!tm", name = "q", descriptor = "(B)Ljava/util/List;", line = 175)
	List method29167() {
		if (this.aClass161_54 == null || !this.aBoolean803) {
			return null;
		}
		@Pc(14) Class161 local14 = this.aClass161_54;
		synchronized (this.aClass161_54) {
			@Pc(25) List local25 = (List) this.aClass161_54.method23219((long) (this.anInt5180 * -913853155));
			if (local25 == null && this.aBoolean803) {
				local25 = new ArrayList();
				this.aClass161_54.method23239(local25, (long) (this.anInt5180 * -913853155), 0);
			}
			return local25;
		}
	}

	@OriginalMember(owner = "client!tm", name = "bm", descriptor = "()Ljava/util/List;", line = 175)
	List method29173() {
		if (this.aClass161_54 == null || !this.aBoolean803) {
			return null;
		}
		@Pc(14) Class161 local14 = this.aClass161_54;
		synchronized (this.aClass161_54) {
			@Pc(25) List local25 = (List) this.aClass161_54.method23219((long) (this.anInt5180 * -913853155));
			if (local25 == null && this.aBoolean803) {
				local25 = new ArrayList();
				this.aClass161_54.method23239(local25, (long) (this.anInt5180 * -913853155), 0);
			}
			return local25;
		}
	}

	@OriginalMember(owner = "client!tm", name = "bf", descriptor = "()Ljava/util/List;", line = 175)
	List method29174() {
		if (this.aClass161_54 == null || !this.aBoolean803) {
			return null;
		}
		@Pc(14) Class161 local14 = this.aClass161_54;
		synchronized (this.aClass161_54) {
			@Pc(25) List local25 = (List) this.aClass161_54.method23219((long) (this.anInt5180 * -913853155));
			if (local25 == null && this.aBoolean803) {
				local25 = new ArrayList();
				this.aClass161_54.method23239(local25, (long) (this.anInt5180 * -913853155), 0);
			}
			return local25;
		}
	}

	@OriginalMember(owner = "client!tm", name = "fa", descriptor = "(Lclient!vs;I)V", line = 5094)
	static final void method29175(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class160.method23209(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!tm", name = "nm", descriptor = "(Lclient!vs;I)V", line = 6581)
	static final void method29176(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class354.method26625(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!tm", name = "pg", descriptor = "(Lclient!vs;I)V", line = 6854)
	static final void method29179(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local11.aBoolean628 ? 1 : 0;
	}

	@OriginalMember(owner = "client!tm", name = "ajy", descriptor = "(Lclient!vs;I)V", line = 10842)
	static final void method29177(@OriginalArg(0) Class536 arg0) {
		if (!Class80.aClass23_Sub1_1.method5830().method24228()) {
			throw new RuntimeException();
		}
		@Pc(14) Class69_Sub1 local14 = (Class69_Sub1) Class80.aClass23_Sub1_1.method5799();
		local14.method20230(Class383.aClass327_2, -1, 0.0F);
		client.aBoolean586 = true;
	}
}
