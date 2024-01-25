import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!b")
public final class Class271 {

	@OriginalMember(owner = "loader!b", name = "b", descriptor = "Ljava/awt/DisplayMode;")
	private DisplayMode aDisplayMode1;

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "Ljava/awt/GraphicsDevice;")
	private GraphicsDevice aGraphicsDevice1;

	@OriginalMember(owner = "loader!b", name = "<init>", descriptor = "()V")
	public Class271() throws Exception {
		@Pc(3) GraphicsEnvironment local3 = GraphicsEnvironment.getLocalGraphicsEnvironment();
		this.aGraphicsDevice1 = local3.getDefaultScreenDevice();
		if (!this.aGraphicsDevice1.isFullScreenSupported()) {
			@Pc(15) GraphicsDevice[] local15 = local3.getScreenDevices();
			for (@Pc(19) int local19 = 0; local19 < local15.length; local19++) {
				@Pc(31) GraphicsDevice local31 = local15[local19];
				if (local31 != null && local31.isFullScreenSupported()) {
					this.aGraphicsDevice1 = local31;
					return;
				}
			}
			throw new Exception();
		}
	}

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(B)[I")
	public int[] method5652() {
		@Pc(9) DisplayMode[] local9 = this.aGraphicsDevice1.getDisplayModes();
		@Pc(15) int[] local15 = new int[local9.length << 2];
		for (@Pc(17) int local17 = 0; local17 < local9.length; local17++) {
			local15[local17 << 2] = local9[local17].getWidth();
			local15[(local17 << 2) + 1] = local9[local17].getHeight();
			local15[(local17 << 2) + 2] = local9[local17].getBitDepth();
			local15[(local17 << 2) + 3] = local9[local17].getRefreshRate();
		}
		return local15;
	}

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(Z)V")
	public void method5653() {
		if (this.aDisplayMode1 != null) {
			this.aGraphicsDevice1.setDisplayMode(this.aDisplayMode1);
			if (!this.aGraphicsDevice1.getDisplayMode().equals(this.aDisplayMode1)) {
				throw new RuntimeException("Did not return to correct resolution!");
			}
			this.aDisplayMode1 = null;
		}
		this.method5655(null);
	}

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(IIILjava/awt/Frame;II)V")
	public void method5654(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Frame arg3, @OriginalArg(5) int arg4) {
		this.aDisplayMode1 = this.aGraphicsDevice1.getDisplayMode();
		if (this.aDisplayMode1 == null) {
			throw new NullPointerException();
		}
		arg3.setUndecorated(true);
		arg3.enableInputMethods(false);
		this.method5655(arg3);
		if (arg1 == 0) {
			@Pc(37) int local37 = this.aDisplayMode1.getRefreshRate();
			@Pc(41) DisplayMode[] local41 = this.aGraphicsDevice1.getDisplayModes();
			@Pc(43) boolean local43 = false;
			for (@Pc(45) int local45 = 0; local45 < local41.length; local45++) {
				if (local41[local45].getWidth() == arg2 && arg0 == local41[local45].getHeight() && local41[local45].getBitDepth() == arg4) {
					@Pc(76) int local76 = local41[local45].getRefreshRate();
					if (!local43 || Math.abs(local76 - local37) < Math.abs(arg1 - local37)) {
						local43 = true;
						arg1 = local76;
					}
				}
			}
			if (!local43) {
				arg1 = local37;
			}
		}
		this.aGraphicsDevice1.setDisplayMode(new DisplayMode(arg2, arg0, arg4, arg1));
	}

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(ILjava/awt/Frame;)V")
	private void method5655(@OriginalArg(1) Frame arg0) {
		@Pc(1) boolean local1 = false;
		try {
			@Pc(10) Field local10 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
			local10.setAccessible(true);
			@Pc(20) boolean local20 = (Boolean) local10.get(this.aGraphicsDevice1);
			if (local20) {
				local10.set(this.aGraphicsDevice1, Boolean.FALSE);
				local1 = true;
			}
		} catch (@Pc(31) Throwable local31) {
		}
		try {
			this.aGraphicsDevice1.setFullScreenWindow(arg0);
		} finally {
			if (local1) {
				try {
					@Pc(58) Field local58 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
					local58.set(this.aGraphicsDevice1, Boolean.TRUE);
				} catch (@Pc(65) Throwable local65) {
				}
			}
		}
	}
}
