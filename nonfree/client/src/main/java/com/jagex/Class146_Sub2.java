package com.jagex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aiz")
public class Class146_Sub2 extends Class146 {

	@OriginalMember(owner = "client!aiz", name = "e", descriptor = "F")
	static final float aFloat141 = 2.0F;

	@OriginalMember(owner = "client!aiz", name = "k", descriptor = "Z")
	volatile boolean aBoolean260 = false;

	@OriginalMember(owner = "client!aiz", name = "l", descriptor = "Ljava/util/List;")
	List aList1 = new ArrayList();

	@OriginalMember(owner = "client!aiz", name = "u", descriptor = "Ljava/lang/Runnable;")
	Runnable aRunnable3 = new Class577(this);

	@OriginalMember(owner = "client!aiz", name = "z", descriptor = "Ljava/lang/Runnable;")
	Runnable aRunnable4 = new Class583(this);

	@OriginalMember(owner = "client!aiz", name = "m", descriptor = "Lclient!mb;")
	Class412 aClass412_2 = new Class412(this);

	@OriginalMember(owner = "client!aiz", name = "n", descriptor = "Ljava/util/HashMap;")
	HashMap aHashMap3 = new HashMap();

	@OriginalMember(owner = "client!aiz", name = "f", descriptor = "Ljava/lang/Thread;")
	Thread aThread3;

	@OriginalMember(owner = "client!aiz", name = "w", descriptor = "Ljava/lang/Thread;")
	Thread aThread4;

	@OriginalMember(owner = "client!aiz", name = "aw", descriptor = "(I)Ljava/util/HashMap;", line = 99)
	HashMap method11705() {
		return this.aHashMap3;
	}

	@OriginalMember(owner = "client!aiz", name = "ad", descriptor = "()Ljava/util/HashMap;", line = 99)
	HashMap method11706() {
		return this.aHashMap3;
	}

	@OriginalMember(owner = "client!aiz", name = "at", descriptor = "()Ljava/util/HashMap;", line = 99)
	HashMap method11708() {
		return this.aHashMap3;
	}

	@OriginalMember(owner = "client!aiz", name = "<init>", descriptor = "(Lclient!xf;)V", line = 102)
	public Class146_Sub2(@OriginalArg(0) Class657 arg0) {
		@Pc(37) Iterator local37 = arg0.aHashMap13.keySet().iterator();
		@Pc(44) Class508 local44;
		while (local37.hasNext()) {
			local44 = (Class508) local37.next();
			this.aHashMap3.put(local44, new Class535[(Integer) arg0.aHashMap13.get(local44)]);
		}
		local37 = this.aHashMap3.keySet().iterator();
		while (local37.hasNext()) {
			local44 = (Class508) local37.next();
			@Pc(76) Class535[] local76 = (Class535[]) this.aHashMap3.get(local44);
			for (@Pc(78) int local78 = 0; local78 < local76.length; local78++) {
				@Pc(87) Class315 local87 = new Class315(2.0F);
				local87.method26999(0, Class433.aClass433_3, Class426.aClass426_3, 2);
				local76[local78] = new Class535(local44, 8192, 3, local87, this);
			}
		}
		@Pc(114) Class580 local114 = new Class580(this, 44100.0F, 32768);
		@Pc(121) Class580 local121 = new Class580(this, 22050.0F, 16384);
		this.aList1.add(local114);
		this.aList1.add(local121);
		this.aThread3 = new Thread(this.aRunnable4);
		this.aThread4 = new Thread(this.aRunnable3);
		this.aThread3.setPriority(10);
		this.aThread4.setPriority(10);
		this.aThread3.start();
		this.aThread4.start();
	}

	@OriginalMember(owner = "client!aiz", name = "e", descriptor = "(I)V", line = 138)
	@Override
	public void method11683() {
		if (this.aClass412_2 != null) {
			this.aClass412_2.method28658();
		}
		@Pc(12) Iterator local12 = this.aHashMap3.keySet().iterator();
		while (true) {
			@Pc(26) Class535[] local26;
			@Pc(69) int local69;
			@Pc(62) byte local62;
			do {
				if (!local12.hasNext()) {
					return;
				}
				@Pc(19) Class508 local19 = (Class508) local12.next();
				local26 = (Class535[]) this.aHashMap3.get(local19);
				if (!local19.aBoolean786) {
					@Pc(31) boolean local31 = false;
					for (@Pc(33) int local33 = 0; local33 < local26.length; local33++) {
						local26[local33].method30752();
						local31 |= local26[local33].method30739();
					}
					if (local31) {
						Arrays.sort(local26, new Class581(this));
					}
				}
				local62 = 6;
				@Pc(64) boolean local64 = false;
				local69 = local26.length - 1;
				while (!local64) {
					@Pc(78) float local78 = local26[local69].method30682();
					@Pc(84) Class511 local84 = local26[local69].method30701();
					if (local78 >= 0.0F) {
						local64 = true;
					} else if (Class511.aClass511_6 == local84 || Class511.aClass511_4 == local84 || local84 == Class511.aClass511_5) {
						local26[local69].method30640();
					}
					local69--;
					if (local69 < 0) {
						local64 = true;
					}
				}
			} while (local69 < local26.length - local62);
			while (local69 >= local26.length - local62) {
				@Pc(129) Class511 local129 = local26[local69].method30701();
				if (local129 == Class511.aClass511_6) {
					local26[local69].method30640();
				}
				local69--;
			}
		}
	}

	@OriginalMember(owner = "client!aiz", name = "p", descriptor = "()V", line = 138)
	@Override
	public void method11679() {
		if (this.aClass412_2 != null) {
			this.aClass412_2.method28658();
		}
		@Pc(12) Iterator local12 = this.aHashMap3.keySet().iterator();
		while (true) {
			@Pc(26) Class535[] local26;
			@Pc(69) int local69;
			@Pc(62) byte local62;
			do {
				if (!local12.hasNext()) {
					return;
				}
				@Pc(19) Class508 local19 = (Class508) local12.next();
				local26 = (Class535[]) this.aHashMap3.get(local19);
				if (!local19.aBoolean786) {
					@Pc(31) boolean local31 = false;
					for (@Pc(33) int local33 = 0; local33 < local26.length; local33++) {
						local26[local33].method30752();
						local31 |= local26[local33].method30739();
					}
					if (local31) {
						Arrays.sort(local26, new Class581(this));
					}
				}
				local62 = 6;
				@Pc(64) boolean local64 = false;
				local69 = local26.length - 1;
				while (!local64) {
					@Pc(78) float local78 = local26[local69].method30682();
					@Pc(84) Class511 local84 = local26[local69].method30701();
					if (local78 >= 0.0F) {
						local64 = true;
					} else if (Class511.aClass511_6 == local84 || Class511.aClass511_4 == local84 || local84 == Class511.aClass511_5) {
						local26[local69].method30640();
					}
					local69--;
					if (local69 < 0) {
						local64 = true;
					}
				}
			} while (local69 < local26.length - local62);
			while (local69 >= local26.length - local62) {
				@Pc(129) Class511 local129 = local26[local69].method30701();
				if (local129 == Class511.aClass511_6) {
					local26[local69].method30640();
				}
				local69--;
			}
		}
	}

	@OriginalMember(owner = "client!aiz", name = "c", descriptor = "(Ljava/lang/Object;)I", line = 198)
	@Override
	public int method11680(@OriginalArg(0) Object arg0) {
		if (arg0 == null || !(arg0 instanceof Class570)) {
			return 0;
		}
		@Pc(7) Class570 local7 = (Class570) arg0;
		@Pc(11) Class580 local11 = local7.aClass580_1;
		synchronized (local7.aClass580_1) {
			return local7.method31316();
		}
	}

	@OriginalMember(owner = "client!aiz", name = "d", descriptor = "(Ljava/lang/Object;)I", line = 198)
	@Override
	public int method11698(@OriginalArg(0) Object arg0) {
		if (arg0 == null || !(arg0 instanceof Class570)) {
			return 0;
		}
		@Pc(7) Class570 local7 = (Class570) arg0;
		@Pc(11) Class580 local11 = local7.aClass580_1;
		synchronized (local7.aClass580_1) {
			return local7.method31316();
		}
	}

	@OriginalMember(owner = "client!aiz", name = "f", descriptor = "(Ljava/lang/Object;I)I", line = 198)
	@Override
	public int method11673(@OriginalArg(0) Object arg0) {
		if (arg0 == null || !(arg0 instanceof Class570)) {
			return 0;
		}
		@Pc(7) Class570 local7 = (Class570) arg0;
		@Pc(11) Class580 local11 = local7.aClass580_1;
		synchronized (local7.aClass580_1) {
			return local7.method31316();
		}
	}

	@OriginalMember(owner = "client!aiz", name = "am", descriptor = "(F)Lclient!ts;", line = 208)
	Class580 method11704(@OriginalArg(0) float arg0) {
		@Pc(1) float local1 = -1.0F;
		@Pc(3) float local3 = Float.MAX_VALUE;
		@Pc(5) Class580 local5 = null;
		@Pc(9) Iterator local9 = this.aList1.iterator();
		while (true) {
			@Pc(16) Class580 local16;
			@Pc(19) float local19;
			@Pc(24) float local24;
			do {
				if (!local9.hasNext()) {
					return local5;
				}
				local16 = (Class580) local9.next();
				local19 = local16.aFloat335;
				local24 = Math.abs(local19 - arg0);
			} while (!(local1 < 0.0F) && !(local24 < local3));
			local1 = local19;
			local3 = local24;
			local5 = local16;
		}
	}

	@OriginalMember(owner = "client!aiz", name = "as", descriptor = "(FI)Lclient!ts;", line = 208)
	Class580 method11707(@OriginalArg(0) float arg0) {
		@Pc(1) float local1 = -1.0F;
		@Pc(3) float local3 = Float.MAX_VALUE;
		@Pc(5) Class580 local5 = null;
		@Pc(9) Iterator local9 = this.aList1.iterator();
		while (true) {
			@Pc(16) Class580 local16;
			@Pc(19) float local19;
			@Pc(24) float local24;
			do {
				if (!local9.hasNext()) {
					return local5;
				}
				local16 = (Class580) local9.next();
				local19 = local16.aFloat335;
				local24 = Math.abs(local19 - arg0);
			} while (!(local1 < 0.0F) && !(local24 < local3));
			local1 = local19;
			local3 = local24;
			local5 = local16;
		}
	}

	@OriginalMember(owner = "client!aiz", name = "n", descriptor = "(IILclient!nd;Lclient!mw;IFB)Ljava/lang/Object;", line = 227)
	@Override
	public Object method11670(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class433 arg2, @OriginalArg(3) Class426 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		@Pc(7) Class580 local7 = this.method11707(arg5 * (float) arg1);
		@Pc(43) Class570 local43 = new Class570(this, local7, arg4, (float) arg1 * arg5, arg2.anInt4806 * -150999407, arg0 < 2 ? 2 : arg0, Class433.aClass433_3 == arg2 || Class433.aClass433_4 == arg2, Class426.aClass426_2 == arg3);
		@Pc(47) Class580 local47 = local43.aClass580_1;
		synchronized (local43.aClass580_1) {
			local43.aClass580_1.method31378(local43);
			return local43;
		}
	}

	@OriginalMember(owner = "client!aiz", name = "r", descriptor = "(IILclient!nd;Lclient!mw;IF)Ljava/lang/Object;", line = 227)
	@Override
	public Object method11681(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class433 arg2, @OriginalArg(3) Class426 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		@Pc(7) Class580 local7 = this.method11707(arg5 * (float) arg1);
		@Pc(43) Class570 local43 = new Class570(this, local7, arg4, (float) arg1 * arg5, arg2.anInt4806 * -150999407, arg0 < 2 ? 2 : arg0, Class433.aClass433_3 == arg2 || Class433.aClass433_4 == arg2, Class426.aClass426_2 == arg3);
		@Pc(47) Class580 local47 = local43.aClass580_1;
		synchronized (local43.aClass580_1) {
			local43.aClass580_1.method31378(local43);
			return local43;
		}
	}

	@OriginalMember(owner = "client!aiz", name = "o", descriptor = "(IILclient!nd;Lclient!mw;IF)Ljava/lang/Object;", line = 227)
	@Override
	public Object method11686(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class433 arg2, @OriginalArg(3) Class426 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		@Pc(7) Class580 local7 = this.method11707(arg5 * (float) arg1);
		@Pc(43) Class570 local43 = new Class570(this, local7, arg4, (float) arg1 * arg5, arg2.anInt4806 * -150999407, arg0 < 2 ? 2 : arg0, Class433.aClass433_3 == arg2 || Class433.aClass433_4 == arg2, Class426.aClass426_2 == arg3);
		@Pc(47) Class580 local47 = local43.aClass580_1;
		synchronized (local43.aClass580_1) {
			local43.aClass580_1.method31378(local43);
			return local43;
		}
	}

	@OriginalMember(owner = "client!aiz", name = "v", descriptor = "(IILclient!nd;Lclient!mw;IF)Ljava/lang/Object;", line = 227)
	@Override
	public Object method11682(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class433 arg2, @OriginalArg(3) Class426 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		@Pc(7) Class580 local7 = this.method11707(arg5 * (float) arg1);
		@Pc(43) Class570 local43 = new Class570(this, local7, arg4, (float) arg1 * arg5, arg2.anInt4806 * -150999407, arg0 < 2 ? 2 : arg0, Class433.aClass433_3 == arg2 || Class433.aClass433_4 == arg2, Class426.aClass426_2 == arg3);
		@Pc(47) Class580 local47 = local43.aClass580_1;
		synchronized (local43.aClass580_1) {
			local43.aClass580_1.method31378(local43);
			return local43;
		}
	}

	@OriginalMember(owner = "client!aiz", name = "y", descriptor = "(Ljava/lang/Object;)V", line = 236)
	@Override
	public void method11685(@OriginalArg(0) Object arg0) {
		if (arg0 == null || !(arg0 instanceof Class570)) {
			return;
		}
		@Pc(8) Class570 local8 = (Class570) arg0;
		@Pc(12) Class580 local12 = local8.aClass580_1;
		synchronized (local8.aClass580_1) {
			local8.aClass580_1.method31379(local8);
		}
	}

	@OriginalMember(owner = "client!aiz", name = "m", descriptor = "(Ljava/lang/Object;I)V", line = 236)
	@Override
	public void method11672(@OriginalArg(0) Object arg0) {
		if (arg0 == null || !(arg0 instanceof Class570)) {
			return;
		}
		@Pc(8) Class570 local8 = (Class570) arg0;
		@Pc(12) Class580 local12 = local8.aClass580_1;
		synchronized (local8.aClass580_1) {
			local8.aClass580_1.method31379(local8);
		}
	}

	@OriginalMember(owner = "client!aiz", name = "s", descriptor = "(Ljava/lang/Object;)V", line = 236)
	@Override
	public void method11678(@OriginalArg(0) Object arg0) {
		if (arg0 == null || !(arg0 instanceof Class570)) {
			return;
		}
		@Pc(8) Class570 local8 = (Class570) arg0;
		@Pc(12) Class580 local12 = local8.aClass580_1;
		synchronized (local8.aClass580_1) {
			local8.aClass580_1.method31379(local8);
		}
	}

	@OriginalMember(owner = "client!aiz", name = "q", descriptor = "(Ljava/lang/Object;[BII)V", line = 245)
	@Override
	public void method11676(@OriginalArg(0) Object arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 == null || !(arg0 instanceof Class570)) {
			return;
		}
		@Pc(8) Class570 local8 = (Class570) arg0;
		@Pc(12) Class580 local12 = local8.aClass580_1;
		synchronized (local8.aClass580_1) {
			local8.method31314(arg1, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!aiz", name = "x", descriptor = "(Ljava/lang/Object;[BII)V", line = 245)
	@Override
	public void method11687(@OriginalArg(0) Object arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 == null || !(arg0 instanceof Class570)) {
			return;
		}
		@Pc(8) Class570 local8 = (Class570) arg0;
		@Pc(12) Class580 local12 = local8.aClass580_1;
		synchronized (local8.aClass580_1) {
			local8.method31314(arg1, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!aiz", name = "b", descriptor = "(Ljava/lang/Object;[BII)V", line = 245)
	@Override
	public void method11688(@OriginalArg(0) Object arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 == null || !(arg0 instanceof Class570)) {
			return;
		}
		@Pc(8) Class570 local8 = (Class570) arg0;
		@Pc(12) Class580 local12 = local8.aClass580_1;
		synchronized (local8.aClass580_1) {
			local8.method31314(arg1, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!aiz", name = "k", descriptor = "(Ljava/lang/Object;[BIII)V", line = 245)
	@Override
	public void method11684(@OriginalArg(0) Object arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 == null || !(arg0 instanceof Class570)) {
			return;
		}
		@Pc(8) Class570 local8 = (Class570) arg0;
		@Pc(12) Class580 local12 = local8.aClass580_1;
		synchronized (local8.aClass580_1) {
			local8.method31314(arg1, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!aiz", name = "w", descriptor = "(Lclient!qk;B)Lclient!rq;", line = 254)
	@Override
	public Class535 method11674(@OriginalArg(0) Class508 arg0) {
		@Pc(3) HashMap local3 = this.aHashMap3;
		synchronized (this.aHashMap3) {
			@Pc(11) Class535[] local11 = (Class535[]) this.aHashMap3.get(arg0);
			if (local11 == null) {
				return null;
			}
			for (@Pc(20) int local20 = 0; local20 < local11.length; local20++) {
				@Pc(28) Class535 local28 = local11[local20];
				@Pc(32) Class511 local32 = local28.method30701();
				if (local32 == Class511.aClass511_2) {
					local28.method30743();
					return local28;
				}
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!aiz", name = "a", descriptor = "(Lclient!qk;)Lclient!rq;", line = 254)
	@Override
	public Class535 method11690(@OriginalArg(0) Class508 arg0) {
		@Pc(3) HashMap local3 = this.aHashMap3;
		synchronized (this.aHashMap3) {
			@Pc(11) Class535[] local11 = (Class535[]) this.aHashMap3.get(arg0);
			if (local11 == null) {
				return null;
			}
			for (@Pc(20) int local20 = 0; local20 < local11.length; local20++) {
				@Pc(28) Class535 local28 = local11[local20];
				@Pc(32) Class511 local32 = local28.method30701();
				if (local32 == Class511.aClass511_2) {
					local28.method30743();
					return local28;
				}
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!aiz", name = "h", descriptor = "(Lclient!qk;)Lclient!rq;", line = 254)
	@Override
	public Class535 method11694(@OriginalArg(0) Class508 arg0) {
		@Pc(3) HashMap local3 = this.aHashMap3;
		synchronized (this.aHashMap3) {
			@Pc(11) Class535[] local11 = (Class535[]) this.aHashMap3.get(arg0);
			if (local11 == null) {
				return null;
			}
			for (@Pc(20) int local20 = 0; local20 < local11.length; local20++) {
				@Pc(28) Class535 local28 = local11[local20];
				@Pc(32) Class511 local32 = local28.method30701();
				if (local32 == Class511.aClass511_2) {
					local28.method30743();
					return local28;
				}
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!aiz", name = "g", descriptor = "(Lclient!qk;)Lclient!rq;", line = 254)
	@Override
	public Class535 method11691(@OriginalArg(0) Class508 arg0) {
		@Pc(3) HashMap local3 = this.aHashMap3;
		synchronized (this.aHashMap3) {
			@Pc(11) Class535[] local11 = (Class535[]) this.aHashMap3.get(arg0);
			if (local11 == null) {
				return null;
			}
			for (@Pc(20) int local20 = 0; local20 < local11.length; local20++) {
				@Pc(28) Class535 local28 = local11[local20];
				@Pc(32) Class511 local32 = local28.method30701();
				if (local32 == Class511.aClass511_2) {
					local28.method30743();
					return local28;
				}
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!aiz", name = "t", descriptor = "(Lclient!mj;)Ljava/lang/Object;", line = 270)
	@Override
	Object method11671(@OriginalArg(0) Class420 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!aiz", name = "l", descriptor = "(Lclient!mj;I)Ljava/lang/Object;", line = 270)
	@Override
	Object method11675(@OriginalArg(0) Class420 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!aiz", name = "j", descriptor = "(Lclient!mj;)Ljava/lang/Object;", line = 270)
	@Override
	Object method11693(@OriginalArg(0) Class420 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!aiz", name = "i", descriptor = "(Lclient!mj;)Ljava/lang/Object;", line = 270)
	@Override
	Object method11692(@OriginalArg(0) Class420 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!aiz", name = "u", descriptor = "(I)Lclient!mb;", line = 274)
	@Override
	public Class412 method11689() {
		return this.aClass412_2;
	}

	@OriginalMember(owner = "client!aiz", name = "ah", descriptor = "()Lclient!mb;", line = 274)
	@Override
	public Class412 method11697() {
		return this.aClass412_2;
	}

	@OriginalMember(owner = "client!aiz", name = "ae", descriptor = "()Lclient!mb;", line = 274)
	@Override
	public Class412 method11695() {
		return this.aClass412_2;
	}

	@OriginalMember(owner = "client!aiz", name = "ag", descriptor = "()Lclient!mb;", line = 274)
	@Override
	public Class412 method11696() {
		return this.aClass412_2;
	}

	@OriginalMember(owner = "client!aiz", name = "al", descriptor = "()Lclient!mb;", line = 274)
	@Override
	public Class412 method11669() {
		return this.aClass412_2;
	}

	@OriginalMember(owner = "client!aiz", name = "z", descriptor = "(B)V", line = 278)
	@Override
	public void method11677() {
		@Pc(3) HashMap local3 = this.method11705();
		synchronized (local3) {
			@Pc(11) Iterator local11 = local3.keySet().iterator();
			while (local11.hasNext()) {
				@Pc(18) Class508 local18 = (Class508) local11.next();
				@Pc(24) Class535[] local24 = (Class535[]) local3.get(local18);
				for (@Pc(26) int local26 = 0; local26 < local24.length; local26++) {
					if (local24[local26].method30701() != Class511.aClass511_2) {
						local24[local26].method30640();
						local24[local26].method30635();
					}
				}
			}
		}
		@Pc(60) boolean local60 = false;
		while (!local60) {
			local60 = true;
			synchronized (local3) {
				@Pc(72) Iterator local72 = local3.keySet().iterator();
				while (local72.hasNext()) {
					@Pc(79) Class508 local79 = (Class508) local72.next();
					@Pc(85) Class535[] local85 = (Class535[]) local3.get(local79);
					for (@Pc(87) int local87 = 0; local87 < local85.length; local87++) {
						if (local85[local87].method30701() != Class511.aClass511_2) {
							local85[local87].method30752();
							local60 = false;
						}
					}
				}
			}
			Class212.method25439(10L);
		}
		this.aBoolean260 = true;
		try {
			this.aThread3.join();
		} catch (@Pc(127) InterruptedException local127) {
			local127.printStackTrace();
		}
		try {
			this.aThread4.join();
		} catch (@Pc(134) InterruptedException local134) {
			local134.printStackTrace();
		}
	}

	@OriginalMember(owner = "client!aiz", name = "ai", descriptor = "()V", line = 278)
	@Override
	public void method11700() {
		@Pc(3) HashMap local3 = this.method11705();
		synchronized (local3) {
			@Pc(11) Iterator local11 = local3.keySet().iterator();
			while (local11.hasNext()) {
				@Pc(18) Class508 local18 = (Class508) local11.next();
				@Pc(24) Class535[] local24 = (Class535[]) local3.get(local18);
				for (@Pc(26) int local26 = 0; local26 < local24.length; local26++) {
					if (local24[local26].method30701() != Class511.aClass511_2) {
						local24[local26].method30640();
						local24[local26].method30635();
					}
				}
			}
		}
		@Pc(60) boolean local60 = false;
		while (!local60) {
			local60 = true;
			synchronized (local3) {
				@Pc(72) Iterator local72 = local3.keySet().iterator();
				while (local72.hasNext()) {
					@Pc(79) Class508 local79 = (Class508) local72.next();
					@Pc(85) Class535[] local85 = (Class535[]) local3.get(local79);
					for (@Pc(87) int local87 = 0; local87 < local85.length; local87++) {
						if (local85[local87].method30701() != Class511.aClass511_2) {
							local85[local87].method30752();
							local60 = false;
						}
					}
				}
			}
			Class212.method25439(10L);
		}
		this.aBoolean260 = true;
		try {
			this.aThread3.join();
		} catch (@Pc(127) InterruptedException local127) {
			local127.printStackTrace();
		}
		try {
			this.aThread4.join();
		} catch (@Pc(134) InterruptedException local134) {
			local134.printStackTrace();
		}
	}

	@OriginalMember(owner = "client!aiz", name = "ac", descriptor = "()V", line = 278)
	@Override
	public void method11699() {
		@Pc(3) HashMap local3 = this.method11705();
		synchronized (local3) {
			@Pc(11) Iterator local11 = local3.keySet().iterator();
			while (local11.hasNext()) {
				@Pc(18) Class508 local18 = (Class508) local11.next();
				@Pc(24) Class535[] local24 = (Class535[]) local3.get(local18);
				for (@Pc(26) int local26 = 0; local26 < local24.length; local26++) {
					if (local24[local26].method30701() != Class511.aClass511_2) {
						local24[local26].method30640();
						local24[local26].method30635();
					}
				}
			}
		}
		@Pc(60) boolean local60 = false;
		while (!local60) {
			local60 = true;
			synchronized (local3) {
				@Pc(72) Iterator local72 = local3.keySet().iterator();
				while (local72.hasNext()) {
					@Pc(79) Class508 local79 = (Class508) local72.next();
					@Pc(85) Class535[] local85 = (Class535[]) local3.get(local79);
					for (@Pc(87) int local87 = 0; local87 < local85.length; local87++) {
						if (local85[local87].method30701() != Class511.aClass511_2) {
							local85[local87].method30752();
							local60 = false;
						}
					}
				}
			}
			Class212.method25439(10L);
		}
		this.aBoolean260 = true;
		try {
			this.aThread3.join();
		} catch (@Pc(127) InterruptedException local127) {
			local127.printStackTrace();
		}
		try {
			this.aThread4.join();
		} catch (@Pc(134) InterruptedException local134) {
			local134.printStackTrace();
		}
	}

	@OriginalMember(owner = "client!aiz", name = "ai", descriptor = "(I)Z", line = 1152)
	static boolean method11709() {
		if (client.anInt3435 * -849002901 == 4) {
			return !Class251.method25973() && !Class631.method32282();
		} else {
			return false;
		}
	}
}
