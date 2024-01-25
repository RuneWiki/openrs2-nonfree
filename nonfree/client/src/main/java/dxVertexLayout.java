import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dxVertexLayout")
public final class dxVertexLayout extends Class185 {

	@OriginalMember(owner = "client!dxVertexLayout", name = "e", descriptor = "Lclient!jagdx/IDirect3DVertexDeclaration;")
	public final IDirect3DVertexDeclaration anIDirect3DVertexDeclaration1;

	@OriginalMember(owner = "client!dxVertexLayout", name = "<init>", descriptor = "(Lclient!ega;[Lclient!th;)V")
	public dxVertexLayout(@OriginalArg(0) Class78_Sub1_Sub1 arg0, @OriginalArg(1) Class318[] arg1) {
		@Pc(7) VertexElementCollection local7 = new VertexElementCollection(arg0.aFl1);
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			@Pc(21) int local21 = 0;
			@Pc(25) Class318 local25 = arg1[local11];
			for (@Pc(27) int local27 = 0; local25.method7064() > local27; local27++) {
				@Pc(37) Class174 local37 = local25.method7060(local27);
				@Pc(49) byte local49;
				@Pc(47) byte local47;
				@Pc(45) int local45;
				if (local37 == Static246.aClass174_1) {
					local45 = 0;
					local49 = 2;
					local47 = 0;
				} else if (Static246.aClass174_2 == local37) {
					local45 = 0;
					local47 = 3;
					local49 = 2;
				} else if (Static246.aClass174_3 == local37) {
					local45 = 0;
					local49 = 4;
					local47 = 10;
				} else if (Static246.aClass174_4 == local37) {
					local45 = local9++;
					local47 = 5;
					local49 = 0;
				} else if (Static246.aClass174_5 == local37) {
					local47 = 5;
					local45 = local9++;
					local49 = 1;
				} else if (local37 == Static246.aClass174_6) {
					local47 = 5;
					local45 = local9++;
					local49 = 2;
				} else {
					local47 = 5;
					local49 = 3;
					local45 = local9++;
				}
				local7.addElement(local11, local49, 0, local47, local45, local21);
				local21 += local37.anInt4535;
			}
		}
		local7.finish();
		this.anIDirect3DVertexDeclaration1 = arg0.anIDirect3DDevice1.a(local7, null);
	}
}
