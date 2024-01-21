import java.applet.Applet;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!vb")
public final class Class86 implements Runnable {

	@OriginalMember(owner = "loader!vb", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString7;

	@OriginalMember(owner = "loader!vb", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString8;

	@OriginalMember(owner = "loader!vb", name = "o", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!vb", name = "l", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!vb", name = "r", descriptor = "Ljava/lang/String;")
	private static String aString9;

	@OriginalMember(owner = "loader!vb", name = "n", descriptor = "I")
	private static final int anInt3285 = 1;

	@OriginalMember(owner = "loader!vb", name = "i", descriptor = "Lloader!dc;")
	private Interface4 anInterface4_1;

	@OriginalMember(owner = "loader!vb", name = "p", descriptor = "[Lloader!l;")
	private Class85[] aClass85Array1;

	@OriginalMember(owner = "loader!vb", name = "q", descriptor = "I")
	private int anInt3284 = 0;

	@OriginalMember(owner = "loader!vb", name = "b", descriptor = "Lloader!l;")
	private Class85 aClass85_2 = null;

	@OriginalMember(owner = "loader!vb", name = "c", descriptor = "Lloader!l;")
	private Class85 aClass85_1 = null;

	@OriginalMember(owner = "loader!vb", name = "j", descriptor = "Ljava/io/File;")
	private File aFile5 = null;

	@OriginalMember(owner = "loader!vb", name = "a", descriptor = "Ljava/io/File;")
	public File aFile6 = null;

	@OriginalMember(owner = "loader!vb", name = "g", descriptor = "Z")
	private boolean aBoolean187 = false;

	@OriginalMember(owner = "loader!vb", name = "k", descriptor = "Lloader!gd;")
	private Class84 aClass84_3 = null;

	@OriginalMember(owner = "loader!vb", name = "e", descriptor = "Lloader!gd;")
	private Class84 aClass84_2 = null;

	@OriginalMember(owner = "loader!vb", name = "s", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3 = null;

	@OriginalMember(owner = "loader!vb", name = "h", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!vb", name = "f", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "loader!vb", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class86(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		this.anApplet3 = arg1;
		aString7 = "1.1";
		aString8 = "Unknown";
		try {
			aString8 = System.getProperty("java.vendor");
			aString7 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString9 = System.getProperty("user.home");
			if (aString9 != null) {
				aString9 = aString9 + "/";
			}
		} catch (@Pc(61) Exception local61) {
		}
		if (aString9 == null) {
			aString9 = "~/";
		}
		try {
			this.anEventQueue2 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(71) Throwable local71) {
		}
		try {
			if (arg1 == null) {
				aMethod4 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				aMethod4 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(98) Exception local98) {
		}
		try {
			if (arg1 == null) {
				aMethod3 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod3 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(125) Exception local125) {
		}
		this.method2297(arg3, arg4, arg2);
		this.aBoolean187 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "loader!vb", name = "a", descriptor = "(Ljava/lang/String;III)V")
	private void method2297(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 < 32 || arg2 > 34) {
			arg2 = 32;
		}
		@Pc(35) String[] local35 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		@Pc(70) String[] local70 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", aString9, "/tmp/", "" };
		@Pc(72) boolean local72 = false;
		for (@Pc(78) int local78 = 0; local78 < 2; local78++) {
			for (@Pc(85) int local85 = 0; local85 < local35.length; local85++) {
				for (@Pc(95) int local95 = 0; local95 < local70.length; local95++) {
					try {
						@Pc(103) String local103 = local70[local95];
						if (local103.length() > 0 && !(new File(local103)).exists()) {
							continue;
						}
						@Pc(131) File local131 = new File(local103 + local35[local85]);
						@Pc(143) boolean local143;
						if (local78 == 1 && !local131.exists()) {
							local143 = local131.mkdir();
							if (!local143) {
								continue;
							}
						}
						@Pc(171) int local171;
						@Pc(156) File local156;
						if (!local72) {
							try {
								local156 = new File(local131, "uid.dat");
								if (local78 == 1 && (!local156.exists() || local156.length() < 4L)) {
									local171 = -1;
									@Pc(175) Random local175 = new Random();
									while (local171 == -1) {
										local171 = local175.nextInt();
									}
									@Pc(191) DataOutputStream local191 = new DataOutputStream(new FileOutputStream(local156));
									local191.writeInt(local171);
									local191.close();
								}
								if (local156.exists()) {
									@Pc(208) DataInputStream local208 = new DataInputStream(new FileInputStream(local156));
									this.anInt3284 = local208.readInt() + 1;
									local72 = true;
									local208.close();
								}
							} catch (@Pc(220) Exception local220) {
							}
						}
						if (this.aFile5 == null) {
							try {
								local131 = new File(local131, arg0);
								if (local78 == 1 && !local131.exists()) {
									local143 = local131.mkdir();
									if (!local143) {
										continue;
									}
								}
								local156 = new File(local131, "main_file_cache.dat2");
								if (local78 == 0 && !local156.exists()) {
									continue;
								}
								this.aClass85_1 = new Class85(local156, "rw", 52428800L);
								this.aClass85Array1 = new Class85[16];
								for (local171 = 0; local171 < 16; local171++) {
									this.aClass85Array1[local171] = new Class85(new File(local131, "main_file_cache.idx" + local171), "rw", 1048576L);
								}
								this.aClass85_2 = new Class85(new File(local131, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile6 = this.aFile5 = local131;
							} catch (@Pc(324) Exception local324) {
								try {
									this.aClass85_1.method2286();
									for (local171 = 0; local171 < 16; local171++) {
										this.aClass85Array1[local171].method2286();
									}
									this.aClass85_2.method2286();
								} catch (@Pc(355) Exception local355) {
								}
								this.aFile6 = this.aFile5 = null;
								this.aClass85_1 = this.aClass85_2 = null;
								this.aClass85Array1 = null;
							}
						}
					} catch (@Pc(372) Exception local372) {
					}
					if (local72 && this.aFile5 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile5 == null) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "loader!vb", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(17) Class84 local17;
			synchronized (this) {
				while (true) {
					if (this.aBoolean187) {
						return;
					}
					if (this.aClass84_3 != null) {
						local17 = this.aClass84_3;
						this.aClass84_3 = this.aClass84_3.aClass84_1;
						if (this.aClass84_3 == null) {
							this.aClass84_2 = null;
						}
						break;
					}
					try {
						this.wait();
					} catch (@Pc(35) InterruptedException local35) {
					}
				}
			}
			try {
				@Pc(47) int local47 = local17.anInt3280;
				if (local47 == 1) {
					local17.anObject5 = new Socket(InetAddress.getByName((String) local17.anObject6), local17.anInt3279);
				} else if (local47 == 2) {
					@Pc(62) Thread local62 = new Thread((Runnable) local17.anObject6);
					local62.setDaemon(true);
					local62.start();
					local62.setPriority(local17.anInt3279);
					local17.anObject5 = local62;
				} else if (local47 == 4) {
					local17.anObject5 = new DataInputStream(((URL) local17.anObject6).openStream());
				} else {
					@Pc(103) Object[] local103;
					if (local47 == 8) {
						local103 = (Object[]) local17.anObject6;
						if (((Class) local103[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject5 = ((Class) local103[0]).getDeclaredMethod((String) local103[1], (Class[]) local103[2]);
					} else if (local47 == 9) {
						local103 = (Object[]) local17.anObject6;
						if (((Class) local103[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject5 = ((Class) local103[0]).getDeclaredField((String) local103[1]);
					} else if (local47 == 3) {
						@Pc(167) String local167 = (local17.anInt3279 >> 24 & 0xFF) + "." + (local17.anInt3279 >> 16 & 0xFF) + "." + (local17.anInt3279 >> 8 & 0xFF) + "." + (local17.anInt3279 & 0xFF);
						local17.anObject5 = InetAddress.getByName(local167).getHostName();
					}
				}
				local17.anInt3281 = 1;
			} catch (@Pc(223) ThreadDeath local223) {
				throw local223;
			} catch (@Pc(226) Throwable local226) {
				local17.anInt3281 = 2;
			}
		}
	}
}
