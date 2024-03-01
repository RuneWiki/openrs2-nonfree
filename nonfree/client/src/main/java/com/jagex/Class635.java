package com.jagex;

import java.util.ArrayList;
import java.util.List;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!we")
public class Class635 implements Interface70 {

	@OriginalMember(owner = "client!we", name = "l", descriptor = "Z")
	boolean aBoolean852;

	@OriginalMember(owner = "client!we", name = "w", descriptor = "[B")
	byte[] aByteArray112;

	@OriginalMember(owner = "client!we", name = "u", descriptor = "I")
	int anInt5727;

	@OriginalMember(owner = "client!we", name = "n", descriptor = "Lclient!wl;")
	Class639 aClass639_1 = Class639.aClass639_4;

	@OriginalMember(owner = "client!we", name = "k", descriptor = "Lclient!py;")
	Class497 aClass497_138;

	@OriginalMember(owner = "client!we", name = "m", descriptor = "I")
	int anInt5726;

	@OriginalMember(owner = "client!we", name = "e", descriptor = "Lclient!mt;")
	Class146 aClass146_4;

	@OriginalMember(owner = "client!we", name = "f", descriptor = "Lclient!wj;")
	Interface68 anInterface68_1;

	@OriginalMember(owner = "client!we", name = "z", descriptor = "Lclient!eb;")
	Class240 aClass240_90;

	@OriginalMember(owner = "client!we", name = "p", descriptor = "Z")
	boolean aBoolean853;

	@OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Lclient!py;ILclient!mt;Lclient!wj;Lclient!eb;)V", line = 24)
	public Class635(@OriginalArg(0) Class497 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class146 arg2, @OriginalArg(3) Interface68 arg3, @OriginalArg(4) Class240 arg4) {
		this.aClass497_138 = arg0;
		this.anInt5726 = arg1 * 263895561;
		this.aClass146_4 = arg2;
		this.anInterface68_1 = arg3;
		this.aClass240_90 = arg4;
		this.aBoolean853 = this.aClass240_90 != null;
		this.aClass639_1 = Class639.aClass639_2;
	}

	@OriginalMember(owner = "client!we", name = "e", descriptor = "(B)V", line = 35)
	@Override
	public void method32526() {
		if (Class639.aClass639_2 != this.aClass639_1) {
			return;
		}
		@Pc(12) byte[] local12 = this.aClass497_138.method30059(this.anInt5726 * -1942162375);
		if (local12 == null) {
			return;
		}
		this.aByteArray112 = local12;
		this.method32434();
		this.aClass639_1 = Class639.aClass639_3;
		if (this.anInterface68_1 != null) {
			this.anInterface68_1.method26239(this, local12.length, this.anInt5726 * -1942162375, false);
		}
	}

	@OriginalMember(owner = "client!we", name = "x", descriptor = "()V", line = 35)
	@Override
	public void method32553() {
		if (Class639.aClass639_2 != this.aClass639_1) {
			return;
		}
		@Pc(12) byte[] local12 = this.aClass497_138.method30059(this.anInt5726 * -1942162375);
		if (local12 == null) {
			return;
		}
		this.aByteArray112 = local12;
		this.method32434();
		this.aClass639_1 = Class639.aClass639_3;
		if (this.anInterface68_1 != null) {
			this.anInterface68_1.method26239(this, local12.length, this.anInt5726 * -1942162375, false);
		}
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "()V", line = 35)
	@Override
	public void method32541() {
		if (Class639.aClass639_2 != this.aClass639_1) {
			return;
		}
		@Pc(12) byte[] local12 = this.aClass497_138.method30059(this.anInt5726 * -1942162375);
		if (local12 == null) {
			return;
		}
		this.aByteArray112 = local12;
		this.method32434();
		this.aClass639_1 = Class639.aClass639_3;
		if (this.anInterface68_1 != null) {
			this.anInterface68_1.method26239(this, local12.length, this.anInt5726 * -1942162375, false);
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "()Lclient!rw;", line = 49)
	@Override
	public Class539 method32543() {
		@Pc(5) Class539 local5 = new Class539(this.aClass146_4);
		local5.method30787(this);
		return local5;
	}

	@OriginalMember(owner = "client!we", name = "h", descriptor = "()Lclient!rw;", line = 49)
	@Override
	public Class539 method32542() {
		@Pc(5) Class539 local5 = new Class539(this.aClass146_4);
		local5.method30787(this);
		return local5;
	}

	@OriginalMember(owner = "client!we", name = "g", descriptor = "()Lclient!rw;", line = 49)
	@Override
	public Class539 method32544() {
		@Pc(5) Class539 local5 = new Class539(this.aClass146_4);
		local5.method30787(this);
		return local5;
	}

	@OriginalMember(owner = "client!we", name = "i", descriptor = "()Lclient!rw;", line = 49)
	@Override
	public Class539 method32545() {
		@Pc(5) Class539 local5 = new Class539(this.aClass146_4);
		local5.method30787(this);
		return local5;
	}

	@OriginalMember(owner = "client!we", name = "n", descriptor = "(B)Lclient!rw;", line = 49)
	@Override
	public Class539 method32540() {
		@Pc(5) Class539 local5 = new Class539(this.aClass146_4);
		local5.method30787(this);
		return local5;
	}

	@OriginalMember(owner = "client!we", name = "m", descriptor = "(I)Lclient!wl;", line = 55)
	@Override
	public Class639 method32567() {
		return this.aClass639_1;
	}

	@OriginalMember(owner = "client!we", name = "bi", descriptor = "()Lclient!wl;", line = 55)
	@Override
	public Class639 method32551() {
		return this.aClass639_1;
	}

	@OriginalMember(owner = "client!we", name = "bc", descriptor = "()Lclient!wl;", line = 55)
	@Override
	public Class639 method32578() {
		return this.aClass639_1;
	}

	@OriginalMember(owner = "client!we", name = "bn", descriptor = "()Lclient!wl;", line = 55)
	@Override
	public Class639 method32576() {
		return this.aClass639_1;
	}

	@OriginalMember(owner = "client!we", name = "k", descriptor = "(I)Z", line = 59)
	@Override
	public boolean method32527() {
		return false;
	}

	@OriginalMember(owner = "client!we", name = "bd", descriptor = "()Z", line = 59)
	@Override
	public boolean method32532() {
		return false;
	}

	@OriginalMember(owner = "client!we", name = "bh", descriptor = "()Z", line = 59)
	@Override
	public boolean method32575() {
		return false;
	}

	@OriginalMember(owner = "client!we", name = "bx", descriptor = "()Z", line = 59)
	@Override
	public boolean method32570() {
		return false;
	}

	@OriginalMember(owner = "client!we", name = "f", descriptor = "(I)V", line = 62)
	void method32434() {
	}

	@OriginalMember(owner = "client!we", name = "j", descriptor = "()V", line = 62)
	void method32437() {
	}

	@OriginalMember(owner = "client!we", name = "w", descriptor = "(II)[B", line = 65)
	@Override
	public byte[] method32529(@OriginalArg(0) int arg0) {
		if (this.anInterface68_1 != null) {
			this.anInterface68_1.method26238(this);
		}
		return this.aByteArray112;
	}

	@OriginalMember(owner = "client!we", name = "t", descriptor = "(I)[B", line = 65)
	@Override
	public byte[] method32546(@OriginalArg(0) int arg0) {
		if (this.anInterface68_1 != null) {
			this.anInterface68_1.method26238(this);
		}
		return this.aByteArray112;
	}

	@OriginalMember(owner = "client!we", name = "l", descriptor = "(I)I", line = 72)
	@Override
	public int method32530() {
		return this.aByteArray112 == null ? 0 : this.aByteArray112.length;
	}

	@OriginalMember(owner = "client!we", name = "ae", descriptor = "()I", line = 72)
	@Override
	public int method32539() {
		return this.aByteArray112 == null ? 0 : this.aByteArray112.length;
	}

	@OriginalMember(owner = "client!we", name = "ag", descriptor = "()I", line = 72)
	@Override
	public int method32548() {
		return this.aByteArray112 == null ? 0 : this.aByteArray112.length;
	}

	@OriginalMember(owner = "client!we", name = "ac", descriptor = "()Lclient!qk;", line = 77)
	@Override
	public Class508 method32549() {
		return Class508.aClass508_6;
	}

	@OriginalMember(owner = "client!we", name = "u", descriptor = "(I)Lclient!qk;", line = 77)
	@Override
	public Class508 method32531() {
		return Class508.aClass508_6;
	}

	@OriginalMember(owner = "client!we", name = "al", descriptor = "()Lclient!qk;", line = 77)
	@Override
	public Class508 method32550() {
		return Class508.aClass508_6;
	}

	@OriginalMember(owner = "client!we", name = "ah", descriptor = "()Lclient!qk;", line = 77)
	@Override
	public Class508 method32559() {
		return Class508.aClass508_6;
	}

	@OriginalMember(owner = "client!we", name = "z", descriptor = "(B)I", line = 81)
	@Override
	public int method32558() {
		return this.anInt5726 * -1942162375;
	}

	@OriginalMember(owner = "client!we", name = "aw", descriptor = "()I", line = 81)
	@Override
	public int method32565() {
		return this.anInt5726 * -1942162375;
	}

	@OriginalMember(owner = "client!we", name = "as", descriptor = "()I", line = 81)
	@Override
	public int method32554() {
		return this.anInt5726 * -1942162375;
	}

	@OriginalMember(owner = "client!we", name = "ai", descriptor = "()I", line = 81)
	@Override
	public int method32552() {
		return this.anInt5726 * -1942162375;
	}

	@OriginalMember(owner = "client!we", name = "p", descriptor = "(Lclient!alw;B)V", line = 85)
	@Override
	public void method32533(@OriginalArg(0) Class93_Sub41 arg0) {
		if (this.aClass240_90 == null) {
			return;
		}
		if (this.anInterface68_1 != null) {
			this.anInterface68_1.method26238(this);
		}
		if (this.aBoolean852) {
			throw new RuntimeException("");
		}
		@Pc(23) Class240 local23 = this.aClass240_90;
		synchronized (this.aClass240_90) {
			@Pc(28) List local28 = this.method32436();
			if (local28 != null) {
				local28.add(arg0);
				this.anInt5727 += arg0.aByteArray58.length * -165190447;
				this.method32435(local28, this.anInt5727 * -635997135);
			}
		}
	}

	@OriginalMember(owner = "client!we", name = "at", descriptor = "(Lclient!alw;)V", line = 85)
	@Override
	public void method32555(@OriginalArg(0) Class93_Sub41 arg0) {
		if (this.aClass240_90 == null) {
			return;
		}
		if (this.anInterface68_1 != null) {
			this.anInterface68_1.method26238(this);
		}
		if (this.aBoolean852) {
			throw new RuntimeException("");
		}
		@Pc(23) Class240 local23 = this.aClass240_90;
		synchronized (this.aClass240_90) {
			@Pc(28) List local28 = this.method32436();
			if (local28 != null) {
				local28.add(arg0);
				this.anInt5727 += arg0.aByteArray58.length * -165190447;
				this.method32435(local28, this.anInt5727 * -635997135);
			}
		}
	}

	@OriginalMember(owner = "client!we", name = "d", descriptor = "(II)Lclient!alw;", line = 103)
	@Override
	public Class93_Sub41 method32534(@OriginalArg(0) int arg0) {
		if (this.aClass240_90 == null) {
			return null;
		}
		@Pc(7) Class93_Sub41 local7 = null;
		if (this.anInterface68_1 != null) {
			this.anInterface68_1.method26238(this);
		}
		@Pc(19) Class240 local19 = this.aClass240_90;
		synchronized (this.aClass240_90) {
			@Pc(24) List local24 = this.method32436();
			if (local24.size() > arg0) {
				local7 = (Class93_Sub41) local24.get(arg0);
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!we", name = "am", descriptor = "(I)Lclient!alw;", line = 103)
	@Override
	public Class93_Sub41 method32557(@OriginalArg(0) int arg0) {
		if (this.aClass240_90 == null) {
			return null;
		}
		@Pc(7) Class93_Sub41 local7 = null;
		if (this.anInterface68_1 != null) {
			this.anInterface68_1.method26238(this);
		}
		@Pc(19) Class240 local19 = this.aClass240_90;
		synchronized (this.aClass240_90) {
			@Pc(24) List local24 = this.method32436();
			if (local24.size() > arg0) {
				local7 = (Class93_Sub41) local24.get(arg0);
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!we", name = "ar", descriptor = "(I)Lclient!alw;", line = 103)
	@Override
	public Class93_Sub41 method32528(@OriginalArg(0) int arg0) {
		if (this.aClass240_90 == null) {
			return null;
		}
		@Pc(7) Class93_Sub41 local7 = null;
		if (this.anInterface68_1 != null) {
			this.anInterface68_1.method26238(this);
		}
		@Pc(19) Class240 local19 = this.aClass240_90;
		synchronized (this.aClass240_90) {
			@Pc(24) List local24 = this.method32436();
			if (local24.size() > arg0) {
				local7 = (Class93_Sub41) local24.get(arg0);
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!we", name = "ad", descriptor = "(I)Lclient!alw;", line = 103)
	@Override
	public Class93_Sub41 method32569(@OriginalArg(0) int arg0) {
		if (this.aClass240_90 == null) {
			return null;
		}
		@Pc(7) Class93_Sub41 local7 = null;
		if (this.anInterface68_1 != null) {
			this.anInterface68_1.method26238(this);
		}
		@Pc(19) Class240 local19 = this.aClass240_90;
		synchronized (this.aClass240_90) {
			@Pc(24) List local24 = this.method32436();
			if (local24.size() > arg0) {
				local7 = (Class93_Sub41) local24.get(arg0);
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!we", name = "au", descriptor = "(I)Lclient!alw;", line = 103)
	@Override
	public Class93_Sub41 method32571(@OriginalArg(0) int arg0) {
		if (this.aClass240_90 == null) {
			return null;
		}
		@Pc(7) Class93_Sub41 local7 = null;
		if (this.anInterface68_1 != null) {
			this.anInterface68_1.method26238(this);
		}
		@Pc(19) Class240 local19 = this.aClass240_90;
		synchronized (this.aClass240_90) {
			@Pc(24) List local24 = this.method32436();
			if (local24.size() > arg0) {
				local7 = (Class93_Sub41) local24.get(arg0);
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!we", name = "c", descriptor = "(II)Z", line = 118)
	@Override
	public boolean method32536(@OriginalArg(0) int arg0) {
		if (this.aClass240_90 == null) {
			return false;
		}
		@Pc(7) boolean local7 = false;
		@Pc(11) Class240 local11 = this.aClass240_90;
		synchronized (this.aClass240_90) {
			@Pc(16) List local16 = this.method32436();
			if (local16 != null && local16.size() > arg0) {
				local7 = local16.get(arg0) != null;
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!we", name = "ap", descriptor = "(I)Z", line = 118)
	@Override
	public boolean method32560(@OriginalArg(0) int arg0) {
		if (this.aClass240_90 == null) {
			return false;
		}
		@Pc(7) boolean local7 = false;
		@Pc(11) Class240 local11 = this.aClass240_90;
		synchronized (this.aClass240_90) {
			@Pc(16) List local16 = this.method32436();
			if (local16 != null && local16.size() > arg0) {
				local7 = local16.get(arg0) != null;
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!we", name = "aq", descriptor = "(I)Z", line = 118)
	@Override
	public boolean method32561(@OriginalArg(0) int arg0) {
		if (this.aClass240_90 == null) {
			return false;
		}
		@Pc(7) boolean local7 = false;
		@Pc(11) Class240 local11 = this.aClass240_90;
		synchronized (this.aClass240_90) {
			@Pc(16) List local16 = this.method32436();
			if (local16 != null && local16.size() > arg0) {
				local7 = local16.get(arg0) != null;
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!we", name = "av", descriptor = "(I)Z", line = 118)
	@Override
	public boolean method32563(@OriginalArg(0) int arg0) {
		if (this.aClass240_90 == null) {
			return false;
		}
		@Pc(7) boolean local7 = false;
		@Pc(11) Class240 local11 = this.aClass240_90;
		synchronized (this.aClass240_90) {
			@Pc(16) List local16 = this.method32436();
			if (local16 != null && local16.size() > arg0) {
				local7 = local16.get(arg0) != null;
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!we", name = "ax", descriptor = "(I)Z", line = 118)
	@Override
	public boolean method32562(@OriginalArg(0) int arg0) {
		if (this.aClass240_90 == null) {
			return false;
		}
		@Pc(7) boolean local7 = false;
		@Pc(11) Class240 local11 = this.aClass240_90;
		synchronized (this.aClass240_90) {
			@Pc(16) List local16 = this.method32436();
			if (local16 != null && local16.size() > arg0) {
				local7 = local16.get(arg0) != null;
			}
			return local7;
		}
	}

	@OriginalMember(owner = "client!we", name = "r", descriptor = "(I)Z", line = 130)
	@Override
	public boolean method32535() {
		return this.aClass240_90 != null && this.aBoolean853;
	}

	@OriginalMember(owner = "client!we", name = "ao", descriptor = "()Z", line = 130)
	@Override
	public boolean method32564() {
		return this.aClass240_90 != null && this.aBoolean853;
	}

	@OriginalMember(owner = "client!we", name = "aj", descriptor = "()Z", line = 130)
	@Override
	public boolean method32556() {
		return this.aClass240_90 != null && this.aBoolean853;
	}

	@OriginalMember(owner = "client!we", name = "v", descriptor = "(B)I", line = 134)
	@Override
	public int method32537() {
		if (this.aClass240_90 == null) {
			return 0;
		}
		@Pc(6) int local6 = 0;
		@Pc(10) Class240 local10 = this.aClass240_90;
		synchronized (this.aClass240_90) {
			@Pc(15) List local15 = this.method32436();
			if (local15 != null) {
				local6 = local15.size();
			}
			return local6;
		}
	}

	@OriginalMember(owner = "client!we", name = "ay", descriptor = "()I", line = 134)
	@Override
	public int method32566() {
		if (this.aClass240_90 == null) {
			return 0;
		}
		@Pc(6) int local6 = 0;
		@Pc(10) Class240 local10 = this.aClass240_90;
		synchronized (this.aClass240_90) {
			@Pc(15) List local15 = this.method32436();
			if (local15 != null) {
				local6 = local15.size();
			}
			return local6;
		}
	}

	@OriginalMember(owner = "client!we", name = "ab", descriptor = "()I", line = 134)
	@Override
	public int method32525() {
		if (this.aClass240_90 == null) {
			return 0;
		}
		@Pc(6) int local6 = 0;
		@Pc(10) Class240 local10 = this.aClass240_90;
		synchronized (this.aClass240_90) {
			@Pc(15) List local15 = this.method32436();
			if (local15 != null) {
				local6 = local15.size();
			}
			return local6;
		}
	}

	@OriginalMember(owner = "client!we", name = "az", descriptor = "()I", line = 134)
	@Override
	public int method32580() {
		if (this.aClass240_90 == null) {
			return 0;
		}
		@Pc(6) int local6 = 0;
		@Pc(10) Class240 local10 = this.aClass240_90;
		synchronized (this.aClass240_90) {
			@Pc(15) List local15 = this.method32436();
			if (local15 != null) {
				local6 = local15.size();
			}
			return local6;
		}
	}

	@OriginalMember(owner = "client!we", name = "o", descriptor = "(ZB)V", line = 146)
	@Override
	public void method32538(@OriginalArg(0) boolean arg0) {
		if (this.anInterface68_1 != null) {
			this.anInterface68_1.method26238(this);
		}
		this.aBoolean852 = arg0;
	}

	@OriginalMember(owner = "client!we", name = "af", descriptor = "(Z)V", line = 146)
	@Override
	public void method32577(@OriginalArg(0) boolean arg0) {
		if (this.anInterface68_1 != null) {
			this.anInterface68_1.method26238(this);
		}
		this.aBoolean852 = arg0;
	}

	@OriginalMember(owner = "client!we", name = "ak", descriptor = "(Z)V", line = 146)
	@Override
	public void method32568(@OriginalArg(0) boolean arg0) {
		if (this.anInterface68_1 != null) {
			this.anInterface68_1.method26238(this);
		}
		this.aBoolean852 = arg0;
	}

	@OriginalMember(owner = "client!we", name = "aa", descriptor = "(Z)V", line = 146)
	@Override
	public void method32579(@OriginalArg(0) boolean arg0) {
		if (this.anInterface68_1 != null) {
			this.anInterface68_1.method26238(this);
		}
		this.aBoolean852 = arg0;
	}

	@OriginalMember(owner = "client!we", name = "s", descriptor = "(S)Z", line = 153)
	@Override
	public boolean method32547() {
		if (this.aClass240_90 == null) {
			return false;
		}
		@Pc(9) List local9 = this.method32436();
		if (local9 == null || local9.size() <= 0) {
			this.aBoolean852 = false;
		}
		return this.aBoolean852;
	}

	@OriginalMember(owner = "client!we", name = "bf", descriptor = "()Z", line = 153)
	@Override
	public boolean method32573() {
		if (this.aClass240_90 == null) {
			return false;
		}
		@Pc(9) List local9 = this.method32436();
		if (local9 == null || local9.size() <= 0) {
			this.aBoolean852 = false;
		}
		return this.aBoolean852;
	}

	@OriginalMember(owner = "client!we", name = "an", descriptor = "()Z", line = 153)
	@Override
	public boolean method32572() {
		if (this.aClass240_90 == null) {
			return false;
		}
		@Pc(9) List local9 = this.method32436();
		if (local9 == null || local9.size() <= 0) {
			this.aBoolean852 = false;
		}
		return this.aBoolean852;
	}

	@OriginalMember(owner = "client!we", name = "bl", descriptor = "()Z", line = 153)
	@Override
	public boolean method32574() {
		if (this.aClass240_90 == null) {
			return false;
		}
		@Pc(9) List local9 = this.method32436();
		if (local9 == null || local9.size() <= 0) {
			this.aBoolean852 = false;
		}
		return this.aBoolean852;
	}

	@OriginalMember(owner = "client!we", name = "y", descriptor = "(Ljava/util/List;II)V", line = 160)
	void method32435(@OriginalArg(0) List arg0, @OriginalArg(1) int arg1) {
		if (this.aClass240_90 == null || arg0 == null || arg1 < 0) {
			return;
		}
		@Pc(11) Class240 local11 = this.aClass240_90;
		synchronized (this.aClass240_90) {
			this.aClass240_90.method25866((long) (this.anInt5726 * -1942162375));
			if (arg1 <= this.aClass240_90.method25834()) {
				this.aClass240_90.method25831(arg0, (long) (this.anInt5726 * -1942162375), arg1);
			} else {
				this.aBoolean853 = false;
				this.aBoolean852 = false;
				this.anInt5727 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!we", name = "q", descriptor = "(S)Ljava/util/List;", line = 175)
	List method32436() {
		if (this.aClass240_90 == null || !this.aBoolean853) {
			return null;
		}
		@Pc(14) Class240 local14 = this.aClass240_90;
		synchronized (this.aClass240_90) {
			@Pc(25) List local25 = (List) this.aClass240_90.method25839((long) (this.anInt5726 * -1942162375));
			if (local25 == null && this.aBoolean853) {
				local25 = new ArrayList();
				this.aClass240_90.method25831(local25, (long) (this.anInt5726 * -1942162375), 0);
			}
			return local25;
		}
	}

	@OriginalMember(owner = "client!we", name = "bk", descriptor = "()Ljava/util/List;", line = 175)
	List method32438() {
		if (this.aClass240_90 == null || !this.aBoolean853) {
			return null;
		}
		@Pc(14) Class240 local14 = this.aClass240_90;
		synchronized (this.aClass240_90) {
			@Pc(25) List local25 = (List) this.aClass240_90.method25839((long) (this.anInt5726 * -1942162375));
			if (local25 == null && this.aBoolean853) {
				local25 = new ArrayList();
				this.aClass240_90.method25831(local25, (long) (this.anInt5726 * -1942162375), 0);
			}
			return local25;
		}
	}

	@OriginalMember(owner = "client!we", name = "bv", descriptor = "(Lclient!yf;B)V", line = 5224)
	static final void method32439(@OriginalArg(0) Class681 arg0) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		if (Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aClass658_1 != null) {
			Class520.aClass132_Sub1_Sub1_Sub1_Sub2_3.aClass658_1.method32788(local13, local23);
		}
	}

	@OriginalMember(owner = "client!we", name = "ka", descriptor = "(S)V", line = 11806)
	static void method32441() {
		for (@Pc(1) int local1 = 0; local1 < 114; local1++) {
			client.aBooleanArray22[local1] = true;
		}
	}

	@OriginalMember(owner = "client!we", name = "bca", descriptor = "(Lclient!yf;B)V", line = 14659)
	static final void method32442(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 1;
	}

	@OriginalMember(owner = "client!we", name = "bfe", descriptor = "(Lclient!yf;I)V", line = 15160)
	static final void method32440(@OriginalArg(0) Class681 arg0) {
		arg0.anInt5888 -= 1915061582;
		arg0.anInt5891 -= -1915563430;
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
	}
}
