package com.jagex;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aem")
public class Class48_Sub1 extends Class48 {

	@OriginalMember(owner = "client!aem", name = "p", descriptor = "F")
	static final float aFloat139 = 2.0F;

	@OriginalMember(owner = "client!aem", name = "l", descriptor = "Z")
	volatile boolean aBoolean198 = false;

	@OriginalMember(owner = "client!aem", name = "s", descriptor = "J")
	long aLong34 = Class176.method23413() * 7721076308646882259L;

	@OriginalMember(owner = "client!aem", name = "u", descriptor = "Ljava/lang/Runnable;")
	Runnable aRunnable2 = new Class118(this);

	@OriginalMember(owner = "client!aem", name = "y", descriptor = "Ljava/lang/Runnable;")
	Runnable aRunnable3 = new Class116(this);

	@OriginalMember(owner = "client!aem", name = "g", descriptor = "Lclient!js;")
	Class264 aClass264_1 = new Class264(this);

	@OriginalMember(owner = "client!aem", name = "a", descriptor = "Ljava/util/HashMap;")
	HashMap aHashMap1 = new HashMap();

	@OriginalMember(owner = "client!aem", name = "h", descriptor = "Ljava/lang/Thread;")
	Thread aThread1;

	@OriginalMember(owner = "client!aem", name = "x", descriptor = "Ljava/lang/Thread;")
	Thread aThread2;

	@OriginalMember(owner = "client!aem", name = "af", descriptor = "()Ljava/util/HashMap;", line = 78)
	HashMap method9022() {
		return this.aHashMap1;
	}

	@OriginalMember(owner = "client!aem", name = "at", descriptor = "()Ljava/util/HashMap;", line = 78)
	HashMap method9023() {
		return this.aHashMap1;
	}

	@OriginalMember(owner = "client!aem", name = "k", descriptor = "()Ljava/util/HashMap;", line = 78)
	HashMap method9024() {
		return this.aHashMap1;
	}

	@OriginalMember(owner = "client!aem", name = "f", descriptor = "(B)Ljava/util/HashMap;", line = 78)
	HashMap method9025() {
		return this.aHashMap1;
	}

	@OriginalMember(owner = "client!aem", name = "<init>", descriptor = "(Lclient!ur;)V", line = 81)
	public Class48_Sub1(@OriginalArg(0) Class511 arg0) {
		@Pc(38) Iterator local38 = arg0.aHashMap9.keySet().iterator();
		@Pc(45) Class357 local45;
		while (local38.hasNext()) {
			local45 = (Class357) local38.next();
			this.aHashMap1.put(local45, new Class371[(Integer) arg0.aHashMap9.get(local45)]);
		}
		local38 = this.aHashMap1.keySet().iterator();
		while (local38.hasNext()) {
			local45 = (Class357) local38.next();
			@Pc(77) Class371[] local77 = (Class371[]) this.aHashMap1.get(local45);
			for (@Pc(79) int local79 = 0; local79 < local77.length; local79++) {
				@Pc(88) Class184 local88 = new Class184(2.0F);
				local88.method23787(0, Class280.aClass280_5, Class289.aClass289_2, 2);
				local77[local79] = new Class371(local45, 32768, 3, local88, this);
			}
		}
		this.aThread1 = new Thread(this.aRunnable3);
		this.aThread2 = new Thread(this.aRunnable2);
		this.aThread1.setPriority(1);
		this.aThread2.setPriority(1);
		this.aThread1.start();
		this.aThread2.start();
	}

	@OriginalMember(owner = "client!aem", name = "p", descriptor = "(B)V", line = 112)
	@Override
	public void method9511() {
		if (this.aClass264_1 != null) {
			this.aClass264_1.method25230();
		}
		@Pc(11) Iterator local11 = this.aHashMap1.keySet().iterator();
		while (true) {
			@Pc(25) Class371[] local25;
			@Pc(68) int local68;
			@Pc(61) byte local61;
			do {
				if (!local11.hasNext()) {
					return;
				}
				@Pc(18) Class357 local18 = (Class357) local11.next();
				local25 = (Class371[]) this.aHashMap1.get(local18);
				if (!local18.aBoolean722) {
					@Pc(30) boolean local30 = false;
					for (@Pc(32) int local32 = 0; local32 < local25.length; local32++) {
						local25[local32].method27131();
						local30 |= local25[local32].method27167();
					}
					if (local30) {
						Arrays.sort(local25, new Class108(this));
					}
				}
				local61 = 3;
				@Pc(63) boolean local63 = false;
				local68 = local25.length - 1;
				while (!local63) {
					@Pc(76) float local76 = local25[local68].method27158();
					@Pc(82) Class375 local82 = local25[local68].method27136();
					if (local76 >= 0.0F) {
						local63 = true;
					} else if (Class375.aClass375_6 == local82 || local82 == Class375.aClass375_4 || local82 == Class375.aClass375_5) {
						local25[local68].method27094();
					}
					local68--;
					if (local68 < 0) {
						local63 = true;
					}
				}
			} while (local68 < local25.length - local61);
			while (local68 >= local25.length - local61) {
				@Pc(127) Class375 local127 = local25[local68].method27136();
				if (local127 == Class375.aClass375_6) {
					local25[local68].method27094();
				}
				local68--;
			}
		}
	}

	@OriginalMember(owner = "client!aem", name = "b", descriptor = "()V", line = 112)
	@Override
	public void method9528() {
		if (this.aClass264_1 != null) {
			this.aClass264_1.method25230();
		}
		@Pc(11) Iterator local11 = this.aHashMap1.keySet().iterator();
		while (true) {
			@Pc(25) Class371[] local25;
			@Pc(68) int local68;
			@Pc(61) byte local61;
			do {
				if (!local11.hasNext()) {
					return;
				}
				@Pc(18) Class357 local18 = (Class357) local11.next();
				local25 = (Class371[]) this.aHashMap1.get(local18);
				if (!local18.aBoolean722) {
					@Pc(30) boolean local30 = false;
					for (@Pc(32) int local32 = 0; local32 < local25.length; local32++) {
						local25[local32].method27131();
						local30 |= local25[local32].method27167();
					}
					if (local30) {
						Arrays.sort(local25, new Class108(this));
					}
				}
				local61 = 3;
				@Pc(63) boolean local63 = false;
				local68 = local25.length - 1;
				while (!local63) {
					@Pc(76) float local76 = local25[local68].method27158();
					@Pc(82) Class375 local82 = local25[local68].method27136();
					if (local76 >= 0.0F) {
						local63 = true;
					} else if (Class375.aClass375_6 == local82 || local82 == Class375.aClass375_4 || local82 == Class375.aClass375_5) {
						local25[local68].method27094();
					}
					local68--;
					if (local68 < 0) {
						local63 = true;
					}
				}
			} while (local68 < local25.length - local61);
			while (local68 >= local25.length - local61) {
				@Pc(127) Class375 local127 = local25[local68].method27136();
				if (local127 == Class375.aClass375_6) {
					local25[local68].method27094();
				}
				local68--;
			}
		}
	}

	@OriginalMember(owner = "client!aem", name = "c", descriptor = "()V", line = 112)
	@Override
	public void method9521() {
		if (this.aClass264_1 != null) {
			this.aClass264_1.method25230();
		}
		@Pc(11) Iterator local11 = this.aHashMap1.keySet().iterator();
		while (true) {
			@Pc(25) Class371[] local25;
			@Pc(68) int local68;
			@Pc(61) byte local61;
			do {
				if (!local11.hasNext()) {
					return;
				}
				@Pc(18) Class357 local18 = (Class357) local11.next();
				local25 = (Class371[]) this.aHashMap1.get(local18);
				if (!local18.aBoolean722) {
					@Pc(30) boolean local30 = false;
					for (@Pc(32) int local32 = 0; local32 < local25.length; local32++) {
						local25[local32].method27131();
						local30 |= local25[local32].method27167();
					}
					if (local30) {
						Arrays.sort(local25, new Class108(this));
					}
				}
				local61 = 3;
				@Pc(63) boolean local63 = false;
				local68 = local25.length - 1;
				while (!local63) {
					@Pc(76) float local76 = local25[local68].method27158();
					@Pc(82) Class375 local82 = local25[local68].method27136();
					if (local76 >= 0.0F) {
						local63 = true;
					} else if (Class375.aClass375_6 == local82 || local82 == Class375.aClass375_4 || local82 == Class375.aClass375_5) {
						local25[local68].method27094();
					}
					local68--;
					if (local68 < 0) {
						local63 = true;
					}
				}
			} while (local68 < local25.length - local61);
			while (local68 >= local25.length - local61) {
				@Pc(127) Class375 local127 = local25[local68].method27136();
				if (local127 == Class375.aClass375_6) {
					local25[local68].method27094();
				}
				local68--;
			}
		}
	}

	@OriginalMember(owner = "client!aem", name = "z", descriptor = "()V", line = 112)
	@Override
	public void method9522() {
		if (this.aClass264_1 != null) {
			this.aClass264_1.method25230();
		}
		@Pc(11) Iterator local11 = this.aHashMap1.keySet().iterator();
		while (true) {
			@Pc(25) Class371[] local25;
			@Pc(68) int local68;
			@Pc(61) byte local61;
			do {
				if (!local11.hasNext()) {
					return;
				}
				@Pc(18) Class357 local18 = (Class357) local11.next();
				local25 = (Class371[]) this.aHashMap1.get(local18);
				if (!local18.aBoolean722) {
					@Pc(30) boolean local30 = false;
					for (@Pc(32) int local32 = 0; local32 < local25.length; local32++) {
						local25[local32].method27131();
						local30 |= local25[local32].method27167();
					}
					if (local30) {
						Arrays.sort(local25, new Class108(this));
					}
				}
				local61 = 3;
				@Pc(63) boolean local63 = false;
				local68 = local25.length - 1;
				while (!local63) {
					@Pc(76) float local76 = local25[local68].method27158();
					@Pc(82) Class375 local82 = local25[local68].method27136();
					if (local76 >= 0.0F) {
						local63 = true;
					} else if (Class375.aClass375_6 == local82 || local82 == Class375.aClass375_4 || local82 == Class375.aClass375_5) {
						local25[local68].method27094();
					}
					local68--;
					if (local68 < 0) {
						local63 = true;
					}
				}
			} while (local68 < local25.length - local61);
			while (local68 >= local25.length - local61) {
				@Pc(127) Class375 local127 = local25[local68].method27136();
				if (local127 == Class375.aClass375_6) {
					local25[local68].method27094();
				}
				local68--;
			}
		}
	}

	@OriginalMember(owner = "client!aem", name = "h", descriptor = "(Ljava/lang/Object;I)I", line = 172)
	@Override
	public int method9515(@OriginalArg(0) Object arg0) {
		@Pc(2) long local2 = Class176.method23413();
		@Pc(15) int local15 = (int) (180000.0F / ((float) (local2 - this.aLong34 * -5221420339335027621L) / 1000.0F));
		this.aLong34 = local2 * 7721076308646882259L;
		return local15;
	}

	@OriginalMember(owner = "client!aem", name = "j", descriptor = "(Ljava/lang/Object;)I", line = 172)
	@Override
	public int method9517(@OriginalArg(0) Object arg0) {
		@Pc(2) long local2 = Class176.method23413();
		@Pc(15) int local15 = (int) (180000.0F / ((float) (local2 - this.aLong34 * -5221420339335027621L) / 1000.0F));
		this.aLong34 = local2 * 7721076308646882259L;
		return local15;
	}

	@OriginalMember(owner = "client!aem", name = "n", descriptor = "(IILclient!kl;Lclient!kx;IF)Ljava/lang/Object;", line = 179)
	@Override
	public Object method9524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class280 arg2, @OriginalArg(3) Class289 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Object();
	}

	@OriginalMember(owner = "client!aem", name = "a", descriptor = "(IILclient!kl;Lclient!kx;IFB)Ljava/lang/Object;", line = 179)
	@Override
	public Object method9512(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class280 arg2, @OriginalArg(3) Class289 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return new Object();
	}

	@OriginalMember(owner = "client!aem", name = "e", descriptor = "(Ljava/lang/Object;)V", line = 182)
	@Override
	public void method9525(@OriginalArg(0) Object arg0) {
	}

	@OriginalMember(owner = "client!aem", name = "g", descriptor = "(Ljava/lang/Object;S)V", line = 182)
	@Override
	public void method9516(@OriginalArg(0) Object arg0) {
	}

	@OriginalMember(owner = "client!aem", name = "r", descriptor = "(Ljava/lang/Object;)V", line = 182)
	@Override
	public void method9513(@OriginalArg(0) Object arg0) {
	}

	@OriginalMember(owner = "client!aem", name = "l", descriptor = "(Ljava/lang/Object;[BIIB)V", line = 183)
	@Override
	public void method9526(@OriginalArg(0) Object arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!aem", name = "d", descriptor = "(Ljava/lang/Object;[BII)V", line = 183)
	@Override
	public void method9527(@OriginalArg(0) Object arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!aem", name = "x", descriptor = "(Lclient!nu;B)Lclient!on;", line = 186)
	@Override
	public Class371 method9510(@OriginalArg(0) Class357 arg0) {
		@Pc(3) HashMap local3 = this.aHashMap1;
		synchronized (this.aHashMap1) {
			@Pc(11) Class371[] local11 = (Class371[]) this.aHashMap1.get(arg0);
			if (local11 == null) {
				return null;
			}
			for (@Pc(20) int local20 = 0; local20 < local11.length; local20++) {
				@Pc(28) Class371 local28 = local11[local20];
				@Pc(32) Class375 local32 = local28.method27136();
				if (Class375.aClass375_2 == local32) {
					local28.method27151();
					return local28;
				}
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!aem", name = "q", descriptor = "(Lclient!nu;)Lclient!on;", line = 186)
	@Override
	public Class371 method9514(@OriginalArg(0) Class357 arg0) {
		@Pc(3) HashMap local3 = this.aHashMap1;
		synchronized (this.aHashMap1) {
			@Pc(11) Class371[] local11 = (Class371[]) this.aHashMap1.get(arg0);
			if (local11 == null) {
				return null;
			}
			for (@Pc(20) int local20 = 0; local20 < local11.length; local20++) {
				@Pc(28) Class371 local28 = local11[local20];
				@Pc(32) Class375 local32 = local28.method27136();
				if (Class375.aClass375_2 == local32) {
					local28.method27151();
					return local28;
				}
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!aem", name = "m", descriptor = "(Lclient!nu;)Lclient!on;", line = 186)
	@Override
	public Class371 method9529(@OriginalArg(0) Class357 arg0) {
		@Pc(3) HashMap local3 = this.aHashMap1;
		synchronized (this.aHashMap1) {
			@Pc(11) Class371[] local11 = (Class371[]) this.aHashMap1.get(arg0);
			if (local11 == null) {
				return null;
			}
			for (@Pc(20) int local20 = 0; local20 < local11.length; local20++) {
				@Pc(28) Class371 local28 = local11[local20];
				@Pc(32) Class375 local32 = local28.method27136();
				if (Class375.aClass375_2 == local32) {
					local28.method27151();
					return local28;
				}
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!aem", name = "v", descriptor = "(Lclient!nu;)Lclient!on;", line = 186)
	@Override
	public Class371 method9530(@OriginalArg(0) Class357 arg0) {
		@Pc(3) HashMap local3 = this.aHashMap1;
		synchronized (this.aHashMap1) {
			@Pc(11) Class371[] local11 = (Class371[]) this.aHashMap1.get(arg0);
			if (local11 == null) {
				return null;
			}
			for (@Pc(20) int local20 = 0; local20 < local11.length; local20++) {
				@Pc(28) Class371 local28 = local11[local20];
				@Pc(32) Class375 local32 = local28.method27136();
				if (Class375.aClass375_2 == local32) {
					local28.method27151();
					return local28;
				}
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!aem", name = "s", descriptor = "(Lclient!kf;I)Ljava/lang/Object;", line = 202)
	@Override
	Object method9523(@OriginalArg(0) Class275 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!aem", name = "i", descriptor = "(Lclient!kf;)Ljava/lang/Object;", line = 202)
	@Override
	Object method9533(@OriginalArg(0) Class275 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!aem", name = "u", descriptor = "(I)Lclient!js;", line = 206)
	@Override
	public Class264 method9518() {
		return this.aClass264_1;
	}

	@OriginalMember(owner = "client!aem", name = "t", descriptor = "()Lclient!js;", line = 206)
	@Override
	public Class264 method9531() {
		return this.aClass264_1;
	}

	@OriginalMember(owner = "client!aem", name = "w", descriptor = "()Lclient!js;", line = 206)
	@Override
	public Class264 method9532() {
		return this.aClass264_1;
	}

	@OriginalMember(owner = "client!aem", name = "y", descriptor = "(I)V", line = 210)
	@Override
	public void method9519() {
		@Pc(3) HashMap local3 = this.method9025();
		synchronized (local3) {
			@Pc(11) Iterator local11 = local3.keySet().iterator();
			while (local11.hasNext()) {
				@Pc(18) Class357 local18 = (Class357) local11.next();
				@Pc(24) Class371[] local24 = (Class371[]) local3.get(local18);
				for (@Pc(26) int local26 = 0; local26 < local24.length; local26++) {
					if (local24[local26].method27136() != Class375.aClass375_2) {
						local24[local26].method27094();
						local24[local26].method27089();
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
					@Pc(79) Class357 local79 = (Class357) local72.next();
					@Pc(85) Class371[] local85 = (Class371[]) local3.get(local79);
					for (@Pc(87) int local87 = 0; local87 < local85.length; local87++) {
						if (local85[local87].method27136() != Class375.aClass375_2) {
							local85[local87].method27131();
							local60 = false;
						}
					}
				}
			}
			Class60_Sub11.method13407(10L);
		}
		this.aBoolean198 = true;
		try {
			this.aThread1.join();
		} catch (@Pc(127) InterruptedException local127) {
			local127.printStackTrace();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(134) InterruptedException local134) {
			local134.printStackTrace();
		}
	}

	@OriginalMember(owner = "client!aem", name = "o", descriptor = "()V", line = 210)
	@Override
	public void method9520() {
		@Pc(3) HashMap local3 = this.method9025();
		synchronized (local3) {
			@Pc(11) Iterator local11 = local3.keySet().iterator();
			while (local11.hasNext()) {
				@Pc(18) Class357 local18 = (Class357) local11.next();
				@Pc(24) Class371[] local24 = (Class371[]) local3.get(local18);
				for (@Pc(26) int local26 = 0; local26 < local24.length; local26++) {
					if (local24[local26].method27136() != Class375.aClass375_2) {
						local24[local26].method27094();
						local24[local26].method27089();
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
					@Pc(79) Class357 local79 = (Class357) local72.next();
					@Pc(85) Class371[] local85 = (Class371[]) local3.get(local79);
					for (@Pc(87) int local87 = 0; local87 < local85.length; local87++) {
						if (local85[local87].method27136() != Class375.aClass375_2) {
							local85[local87].method27131();
							local60 = false;
						}
					}
				}
			}
			Class60_Sub11.method13407(10L);
		}
		this.aBoolean198 = true;
		try {
			this.aThread1.join();
		} catch (@Pc(127) InterruptedException local127) {
			local127.printStackTrace();
		}
		try {
			this.aThread2.join();
		} catch (@Pc(134) InterruptedException local134) {
			local134.printStackTrace();
		}
	}

	@OriginalMember(owner = "client!aem", name = "asc", descriptor = "(Lclient!vs;I)V", line = 12350)
	static final void method9026(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class510.aClass3_Sub45_37.aClass60_Sub7_1.method13279() ? 1 : 0;
	}
}
