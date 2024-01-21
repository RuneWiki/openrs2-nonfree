import java.applet.Applet;
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

@OriginalClass("loader!ha")
public final class Class74 implements Runnable {

	@OriginalMember(owner = "loader!ha", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString6;

	@OriginalMember(owner = "loader!ha", name = "h", descriptor = "Ljava/lang/String;")
	private static String aString7;

	@OriginalMember(owner = "loader!ha", name = "j", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!ha", name = "e", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!ha", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString8;

	@OriginalMember(owner = "loader!ha", name = "q", descriptor = "I")
	private static final int anInt3028 = 1;

	@OriginalMember(owner = "loader!ha", name = "d", descriptor = "Lloader!ad;")
	private Interface5 anInterface5_1;

	@OriginalMember(owner = "loader!ha", name = "k", descriptor = "[Lloader!he;")
	private Class75[] aClass75Array1;

	@OriginalMember(owner = "loader!ha", name = "u", descriptor = "Lloader!ma;")
	private Interface6 anInterface6_1;

	@OriginalMember(owner = "loader!ha", name = "n", descriptor = "Lloader!he;")
	private Class75 aClass75_1 = null;

	@OriginalMember(owner = "loader!ha", name = "l", descriptor = "Lloader!vb;")
	private Class76 aClass76_1 = null;

	@OriginalMember(owner = "loader!ha", name = "p", descriptor = "Z")
	private boolean aBoolean134 = false;

	@OriginalMember(owner = "loader!ha", name = "c", descriptor = "I")
	private int anInt3026 = 0;

	@OriginalMember(owner = "loader!ha", name = "b", descriptor = "Ljava/io/File;")
	private File aFile4 = null;

	@OriginalMember(owner = "loader!ha", name = "g", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2 = null;

	@OriginalMember(owner = "loader!ha", name = "a", descriptor = "Lloader!he;")
	private Class75 aClass75_2 = null;

	@OriginalMember(owner = "loader!ha", name = "m", descriptor = "Lloader!vb;")
	private Class76 aClass76_2 = null;

	@OriginalMember(owner = "loader!ha", name = "r", descriptor = "Ljava/io/File;")
	public File aFile5 = null;

	@OriginalMember(owner = "loader!ha", name = "i", descriptor = "I")
	private int anInt3027 = 0;

	@OriginalMember(owner = "loader!ha", name = "s", descriptor = "Ljava/net/InetAddress;")
	private final InetAddress anInetAddress2;

	@OriginalMember(owner = "loader!ha", name = "t", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "loader!ha", name = "<init>", descriptor = "(ZLjava/applet/Applet;Ljava/net/InetAddress;ILjava/lang/String;I)V")
	public Class74(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) InetAddress arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5) {
		aString6 = "1.1";
		this.anInetAddress2 = arg2;
		aString8 = "Unknown";
		this.anApplet2 = arg1;
		try {
			aString8 = System.getProperty("java.vendor");
			aString6 = System.getProperty("java.version");
		} catch (@Pc(49) Exception local49) {
		}
		try {
			aString7 = System.getProperty("user.home");
			if (aString7 != null) {
				aString7 = aString7 + "/";
			}
		} catch (@Pc(66) Exception local66) {
		}
		if (aString7 == null) {
			aString7 = "~/";
		}
		try {
			if (arg1 == null) {
				aMethod3 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				aMethod3 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(98) Exception local98) {
		}
		try {
			if (arg1 == null) {
				aMethod4 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod4 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(126) Exception local126) {
		}
		this.method2073(arg3, arg5, arg4);
		this.aBoolean134 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "loader!ha", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(16) Class76 local16;
			synchronized (this) {
				while (true) {
					if (this.aBoolean134) {
						return;
					}
					if (this.aClass76_1 != null) {
						local16 = this.aClass76_1;
						this.aClass76_1 = this.aClass76_1.aClass76_3;
						if (this.aClass76_1 == null) {
							this.aClass76_2 = null;
						}
						break;
					}
					try {
						this.wait();
					} catch (@Pc(33) InterruptedException local33) {
					}
				}
			}
			try {
				@Pc(45) int local45 = local16.anInt3033;
				if (local45 == 1) {
					local16.anObject6 = new Socket(this.anInetAddress2, local16.anInt3031);
				} else if (local45 == 2) {
					@Pc(223) Thread local223 = new Thread((Runnable) local16.anObject5);
					local223.setDaemon(true);
					local223.start();
					local223.setPriority(local16.anInt3031);
					local16.anObject6 = local223;
				} else if (local45 == 4) {
					local16.anObject6 = new DataInputStream(((URL) local16.anObject5).openStream());
				} else {
					@Pc(160) Object[] local160;
					if (local45 == 9) {
						local160 = (Object[]) local16.anObject5;
						if (((Class) local160[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject6 = ((Class) local160[0]).getDeclaredMethod((String) local160[1], (Class[]) local160[2]);
					} else if (local45 == 10) {
						local160 = (Object[]) local16.anObject5;
						if (((Class) local160[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject6 = ((Class) local160[0]).getDeclaredField((String) local160[1]);
					} else if (local45 == 3) {
						@Pc(149) String local149 = (local16.anInt3031 >> 24 & 0xFF) + "." + (local16.anInt3031 >> 16 & 0xFF) + "." + (local16.anInt3031 >> 8 & 0xFF) + "." + (local16.anInt3031 & 0xFF);
						local16.anObject6 = InetAddress.getByName(local149).getHostName();
					} else if (local45 == 5) {
						local16.anObject6 = new Class75(new File(this.aFile4, "music" + this.anInt3027 + ".mid"), "rw", 1048576L);
						this.anInt3027 = (this.anInt3027 + 1) % 5;
					}
				}
				local16.anInt3032 = 1;
			} catch (@Pc(250) Exception local250) {
				local16.anInt3032 = 2;
			}
		}
	}

	@OriginalMember(owner = "loader!ha", name = "a", descriptor = "(IIILjava/lang/String;)V")
	private void method2073(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		if (arg0 < 32 || arg0 > 34) {
			arg0 = 32;
		}
		@Pc(45) String[] local45 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", "/tmp/", aString7, "" };
		@Pc(70) String[] local70 = new String[] { ".jagex_cache_" + arg0, ".file_store_" + arg0 };
		@Pc(72) boolean local72 = false;
		for (@Pc(74) int local74 = 0; local74 < 2; local74++) {
			for (@Pc(79) int local79 = 0; local79 < local70.length; local79++) {
				for (@Pc(89) int local89 = 0; local89 < local45.length; local89++) {
					try {
						@Pc(97) String local97 = local45[local89];
						if (local97.length() > 0 && !(new File(local97)).exists()) {
							continue;
						}
						@Pc(122) File local122 = new File(local97 + local70[local79]);
						@Pc(131) boolean local131;
						if (local74 == 1 && !local122.exists()) {
							local131 = local122.mkdir();
							if (!local131) {
								continue;
							}
						}
						@Pc(156) int local156;
						@Pc(143) File local143;
						if (!local72) {
							try {
								local143 = new File(local122, "uid.dat");
								if (local74 == 1 && (!local143.exists() || local143.length() < 4L)) {
									local156 = -1;
									@Pc(160) Random local160 = new Random();
									while (local156 == -1) {
										local156 = local160.nextInt();
									}
									@Pc(175) DataOutputStream local175 = new DataOutputStream(new FileOutputStream(local143));
									local175.writeInt(local156);
									local175.close();
								}
								if (local143.exists()) {
									local72 = true;
									@Pc(193) DataInputStream local193 = new DataInputStream(new FileInputStream(local143));
									this.anInt3026 = local193.readInt() + 1;
									local193.close();
								}
							} catch (@Pc(203) Exception local203) {
							}
						}
						if (this.aFile4 == null) {
							try {
								local122 = new File(local122, arg2);
								if (local74 == 1 && !local122.exists()) {
									local131 = local122.mkdir();
									if (!local131) {
										continue;
									}
								}
								local143 = new File(local122, "main_file_cache.dat2");
								if (local74 == 0 && !local143.exists()) {
									continue;
								}
								this.aClass75_2 = new Class75(local143, "rw", 52428800L);
								this.aClass75Array1 = new Class75[14];
								for (local156 = 0; local156 < 14; local156++) {
									this.aClass75Array1[local156] = new Class75(new File(local122, "main_file_cache.idx" + local156), "rw", 1048576L);
								}
								this.aClass75_1 = new Class75(new File(local122, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile5 = this.aFile4 = local122;
							} catch (@Pc(305) Exception local305) {
								try {
									this.aClass75_2.method2079();
									for (local156 = 0; local156 < 14; local156++) {
										this.aClass75Array1[local156].method2079();
									}
									this.aClass75_1.method2079();
								} catch (@Pc(328) Exception local328) {
								}
								this.aClass75_2 = this.aClass75_1 = null;
								this.aFile5 = this.aFile4 = null;
								this.aClass75Array1 = null;
							}
						}
					} catch (@Pc(345) Exception local345) {
					}
					if (local72 && this.aFile4 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile4 == null) {
			throw new RuntimeException();
		}
	}
}
